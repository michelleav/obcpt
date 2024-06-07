# Onebank CPT

The dream is to have one bank across the world to eliminate transfer fees and unexpected bank charges
while on holiday in another country.


## How to use API
When running it locally in your IDE you can then use the following in POSTMAN or curl

### Request
localhost:8080/obcpt/transfer

### Body
{
    "senderIBAN" :"IBAN2705071215",
    "receiverIBAN" : "IBAN1112000432",
    "amount" : 2500.00
}

## To see the in-memory database
http://localhost:8080/h2_console

### Tables available
Account (Not being used yet)
Transfer
TransferHistory (Not being used yet)
