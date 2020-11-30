import React, {forwardRef} from "react";
import ErrorMessageWell from "./ErrorMessageWell";
import store from "../store/CampingMapStore";
import {fetchReservedSlots} from "../action/CampingMapActions";

class CampingMap extends React.Component {


 getIds() {

        let idArray = [];
        let slots = document.getElementsByClassName("slot");
        console.log(slots[0]);
     console.log(slots[85]);
        //let proba = store._reservedSlots;
        for (let i = 1; i < 170; i++) {
           // idArray.push(slots[i].id);

            let contains = false;
            for (let j = 0; j < this.state.reservedSlots.length; j++) {

                if (this.state.reservedSlots[j].id === i) {
                    contains = true;
                }

            }
            if (contains) {
                document.getElementById(i.toString()).className = "cell slot free";
            }
            else{
                document.getElementById(i.toString()).className = "cell slot taken";
            }
        }
        //console.log(idArray);

        return idArray;
    }

    constructor(props) {
        super(props);
        this.state = {reservedSlots: []};
        this._updateState = this._updateState.bind(this);

    }

    componentDidMount() {
        store.addChangeListener(this._updateState);


    }


    componentWillUnmount() {
        store.removeChangeListener(this._updateState);
    }

    _updateState() {
        this.setState({reservedSlots: store._reservedSlots},
            ()=>this.getIds())


    }


    render() {

        return (
            <div>
                <ErrorMessageWell/>
                <br/><br/><br/><br/><br/>
                <table>
                    <tbody>
                    <tr className="myrow row1">
                        <td className="cell slot" id="1">1</td>
                        <td className="cell slot" id="2">2</td>
                        <td className="cell slot" id="3">3</td>
                        <td className="cell slot" id="4">4</td>
                        <td className="cell slot" id="5">5</td>
                        <td className="cell slot" id="6">6</td>
                        <td className="cell slot" id="7">7</td>
                        <td className="cell slot" id="8">8</td>
                        <td className="cell street"/>
                        <td className="cell building"/>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="17">17</td>
                        <td className="cell slot" id="18">18</td>
                        <td className="cell slot" id="19">19</td>
                        <td className="cell slot" id="20">20</td>
                        <td className="cell slot" id="21">21</td>
                        <td className="cell slot" id="22">22</td>
                        <td className="cell slot" id="23">23</td>
                        <td className="cell slot" id="24">24</td>
                    </tr>

                    <tr className="myrow row2">
                        <td className="cell slot" id="9">9</td>
                        <td className="cell slot" id="10">10</td>
                        <td className="cell slot" id="11">11</td>
                        <td className="cell slot" id="12">12</td>
                        <td className="cell slot" id="13">13</td>
                        <td className="cell slot" id="14">14</td>
                        <td className="cell slot" id="15">15</td>
                        <td className="cell slot" id="16">16</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="25">25</td>
                        <td className="cell slot" id="26">26</td>
                        <td className="cell slot" id="27">27</td>
                        <td className="cell slot" id="28">28</td>
                        <td className="cell slot" id="29">29</td>
                        <td className="cell slot" id="30">30</td>
                        <td className="cell slot" id="31">31</td>
                        <td className="cell slot" id="32">32</td>
                    </tr>

                    <tr className="myrow row3">
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                    </tr>


                    <tr className="myrow row4">
                        <td className="cell slot" id="33">33</td>
                        <td className="cell slot" id="34">34</td>
                        <td className="cell slot" id="35">35</td>
                        <td className="cell slot" id="36">36</td>
                        <td className="cell slot" id="37">37</td>
                        <td className="cell slot" id="38">38</td>
                        <td className="cell slot" id="39">39</td>
                        <td className="cell slot" id="40">40</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="49">49</td>
                        <td className="cell slot" id="50">50</td>
                        <td className="cell slot" id="51">51</td>
                        <td className="cell slot" id="52">52</td>
                        <td className="cell slot" id="53">53</td>
                        <td className="cell slot" id="54">54</td>
                        <td className="cell slot" id="55">55</td>
                        <td className="cell slot" id="56">56</td>
                    </tr>


                    <tr className="myrow row5">
                        <td className="cell slot" id="41">41</td>
                        <td className="cell slot" id="42">42</td>
                        <td className="cell slot" id="43">43</td>
                        <td className="cell slot" id="44">44</td>
                        <td className="cell slot" id="45">45</td>
                        <td className="cell slot" id="46">46</td>
                        <td className="cell slot" id="47">47</td>
                        <td className="cell slot" id="48">48</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="57">57</td>
                        <td className="cell slot" id="58">58</td>
                        <td className="cell slot" id="59">59</td>
                        <td className="cell slot" id="60">60</td>
                        <td className="cell slot" id="61">61</td>
                        <td className="cell slot" id="62">62</td>
                        <td className="cell slot" id="63">63</td>
                        <td className="cell slot" id="64">64</td>
                    </tr>

                    <tr className="myrow row6">
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                    </tr>

                    <tr className="myrow row7">
                        <td colSpan="2" className="cell slot" id="65">65</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="72">72</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="76">76</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="80">80</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="87">87</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="94">94</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="101">101</td>
                    </tr>

                    <tr className="myrow row8">
                        <td colSpan="2" className="cell slot" id="66">66</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="73">73</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="77">77</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="81">81</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="88">88</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="95">95</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="102">102</td>
                    </tr>

                    <tr className="myrow row9">
                        <td colSpan="2" className="cell slot" id="67">67</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="74">74</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="78">78</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="82">82</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="89">89</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="96">96</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="103">103</td>
                    </tr>

                    <tr className="myrow row10">
                        <td colSpan="2" className="cell slot" id="68">68</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="75">75</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="79">79</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="83">83</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="90">90</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="97">97</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="104">104</td>
                    </tr>

                    <tr className="myrow row11">
                        <td colSpan="2" className="cell slot" id="69">69</td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="84">84</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="91">91</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="98">98</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="105">105</td>
                    </tr>

                    <tr className="myrow row12">
                        <td colSpan="2" className="cell slot" id="70">70</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="85">85</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="92">92</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="99">99</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="106">106</td>
                    </tr>

                    <tr className="myrow row13">
                        <td colSpan="2" className="cell slot" id="71">71</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="86">86</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="93">93</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="100">100</td>
                        <td className="cell street"></td>
                        <td colSpan="2" className="cell slot" id="107">107</td>
                    </tr>

                    <tr className="myrow row14">
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                    </tr>

                    <tr className="myrow row15">
                        <td className="cell slot" id="108">108</td>
                        <td className="cell slot" id="109">109</td>
                        <td className="cell slot" id="110">110</td>
                        <td className="cell slot" id="111">111</td>
                        <td className="cell slot" id="112">112</td>
                        <td className="cell slot" id="113">113</td>
                        <td className="cell slot" id="114">114</td>
                        <td className="cell slot" id="115">115</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="140">140</td>
                        <td className="cell slot" id="141">141</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="150">150</td>
                        <td className="cell slot" id="151">151</td>
                        <td className="cell slot" id="152">152</td>
                        <td className="cell slot" id="153">153</td>
                        <td className="cell slot" id="154">154</td>
                        <td className="cell slot" id="155">155</td>
                        <td className="cell slot" id="156">156</td>
                        <td className="cell slot" id="157">157</td>
                    </tr>

                    <tr className="myrow row16">
                        <td className="cell slot" id="116">116</td>
                        <td className="cell slot" id="117">117</td>
                        <td className="cell slot" id="118">118</td>
                        <td className="cell slot" id="119">119</td>
                        <td className="cell slot" id="120">120</td>
                        <td className="cell slot" id="121">121</td>
                        <td className="cell slot" id="122">122</td>
                        <td className="cell slot" id="123">123</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="142">142</td>
                        <td className="cell slot" id="143">143</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="158">158</td>
                        <td className="cell slot" id="159">159</td>
                        <td className="cell slot" id="160">160</td>
                        <td className="cell slot" id="161">161</td>
                        <td className="cell slot" id="162">162</td>
                        <td className="cell slot" id="163">163</td>
                        <td className="cell slot" id="164">164</td>
                        <td className="cell slot" id="165">165</td>
                    </tr>

                    <tr className="myrow row17">
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="144">144</td>
                        <td className="cell slot" id="145">145</td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                        <td className="cell street"></td>
                    </tr>

                    <tr className="myrow row18">
                        <td className="cell slot" id="124">124</td>
                        <td className="cell slot" id="125">125</td>
                        <td className="cell slot" id="126">126</td>
                        <td className="cell slot" id="127">127</td>
                        <td className="cell slot" id="128">128</td>
                        <td className="cell slot" id="129">129</td>
                        <td className="cell slot" id="130">130</td>
                        <td className="cell slot" id="131">131</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="146">146</td>
                        <td className="cell slot" id="147">147</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="166">166</td>
                        <td className="cell slot" id="167">167</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                    </tr>

                    <tr className="myrow row19">
                        <td className="cell slot" id="132">132</td>
                        <td className="cell slot" id="133">133</td>
                        <td className="cell slot" id="134">134</td>
                        <td className="cell slot" id="135">135</td>
                        <td className="cell slot" id="136">136</td>
                        <td className="cell slot" id="137">137</td>
                        <td className="cell slot" id="138">138</td>
                        <td className="cell slot" id="139">139</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="148">148</td>
                        <td className="cell slot" id="149">149</td>
                        <td className="cell street"></td>
                        <td className="cell slot" id="168">168</td>
                        <td className="cell slot" id="169">169</td>
                        <td className="cell street"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                        <td className="cell building"></td>
                    </tr>

                    </tbody>
                </table>

                {/*<button type="submit" className="btn btn-primary" onClick={() => {

                    this.getIds();

                }}>list ids
                </button>*/}

            </div>
        )
    }


}

export default CampingMap;