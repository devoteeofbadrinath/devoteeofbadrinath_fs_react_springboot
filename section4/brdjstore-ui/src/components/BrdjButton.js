import styled from "styled-components";

const BrdjButton = styled.button`
background-color:${props.primary ? "#5b21b6" : "black"}
color: white;
padding: 10px 20px;
border: none;
border-radius: 5px;
cursor: pointer;
display: block;
margin: 0 auto;
`

export default BrdjButton