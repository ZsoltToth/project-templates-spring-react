package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.TransactionCreateRequestDto;
import hu.uni.eku.afp2020_team4.controller.dto.TransactionDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/transaction")
@RequiredArgsConstructor
@Api(tags = "Transaction")
@Slf4j
public class TransactionController {

    private Collection<TransactionDto> transactions = new ArrayList<>();

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch all transactions")
    public Collection<TransactionDto> fetchAll() {
        return transactions.stream().map(transaction ->
                TransactionDto.builder()
                        .id(transaction.getId())
                        .userId(transaction.getUserId())
                        .watchId(transaction.getWatchId())
                        .slideId(transaction.getSlideId())
                        .timestamp(transaction.getTimestamp())
                        .build()
        ).collect(Collectors.toList());
    }

    @GetMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch transaction by ID")
    public TransactionDto fetchById(@PathVariable String id) {
        for(TransactionDto transaction: transactions) {
            if(transaction.getId().equals(id)) {
                return TransactionDto.builder()
                        .id(transaction.getId())
                        .userId(transaction.getUserId())
                        .watchId(transaction.getWatchId())
                        .slideId(transaction.getSlideId())
                        .timestamp(transaction.getTimestamp())
                        .build();
            }
        }

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No transaction found by the given ID!");
    }

    @PostMapping(value = "/create")
    @ApiOperation(value = "Create a transaction")
    public void create() {
        TransactionDto newTransaction = TransactionDto.builder()
                .id(UUID.randomUUID().toString())
                .build();
        transactions.add(newTransaction);
    }

    @PutMapping(value = {"/{id}"})
    @ApiOperation(value = "Update a transaction")
    public void update(@PathVariable String id, @RequestBody TransactionCreateRequestDto request) {
        transactions = transactions.stream().map(
                transaction -> transaction.getId().equals(id)
                        ? TransactionDto.builder()
                        .id(id)
                        .userId(request.getUserId())
                        .watchId(request.getWatchId())
                        .slideId(request.getSlideId())
                        .timestamp(request.getTimestamp())
                        .build()
                        : transaction
        ).collect(Collectors.toList());
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete a transaction")
    public void delete(@PathVariable String id) {
        transactions.removeIf(watch -> watch.getId().equals(id));
    }
}