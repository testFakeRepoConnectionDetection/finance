# Finance (fixture)

Business function: `MANAGEMENT_REPORTING` (`app.business_function`).

Management finance. Consolidates the P&L pack and the general-ledger balances.

## Integrations (topology)

- Exposes `/api/v1/pnl` called by **PNL**.
- Consumes Kafka topic `ledger.balances` produced by **Accounting**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data_category |
|------|-----------|------|---------|---------------|
| PNL | inbound | API | /pnl | `PNL_PACK` |
| Accounting | inbound | KAFKA | ledger.balances | `LEDGER_BALANCE` |

See `TransitDataTypes.java` and `application.yml`.
