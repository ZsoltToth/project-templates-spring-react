package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.ReceiptDto;
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

@RestController
@RequestMapping(value = "/receipt")
@RequiredArgsConstructor
@Api(tags = "Receipt")
@Slf4j
public class ReceiptController {

    private Collection<ReceiptDto> receipts = new ArrayList<>();

    @GetMapping(value = {"/{userId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch receipt by user ID")
    public ReceiptDto fetchById(@PathVariable String userId) {
        // Nem lehet service nélkül visszakeresni, ezért csak az első elemet adja vissza a collectionből
        if (receipts.iterator().hasNext())
            return receipts.iterator().next();

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No receipt found by the given ID!");
    }

    @PostMapping(value = "/create")
    @ApiOperation(value = "Create a receipt")
    public void create() {
        ReceiptDto newReceipt = ReceiptDto.builder()
                .id(UUID.randomUUID().toString())
                .build();
        receipts.add(newReceipt);
    }
}