# Onebank CPT

The dream is to have one bank across the world to eliminate transfer fees and unexpected bank charges
while on holiday in another country.


## Running Microservice
#### 1.IDE

Build the application and run it

#### 2.Docker (Ensure that Docker is installed on your laptop)
Run the folowing in the root directory of the project

`docker-compose up`

To remove the images run

`docker-compose down`

## Interacting with Microservice

### Request

`localhost:8080/obcpt/transfer`

### Body
`{
    "senderIBAN" :"IBAN2705071215",
    "receiverIBAN" : "IBAN1112000432",
    "amount" : 2500.00
}`

## To see the in-memory database
`http://localhost:8080/h2_console`

## Tables
- Account (Not being used yet)

- Transfer

- TransferHistory (Not being used yet)
