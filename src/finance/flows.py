"""Management reporting.

Inbound cashflow from Accounting on the Kafka topic finance.cashflows.
data cashflow, frequency monthly.
"""

BUSINESS_FUNCTION = "MANAGEMENT_REPORTING"
PILLAR = "Finance"

DATA_CASHFLOW = "cashflow"
FREQUENCY_MONTHLY = "monthly"
TOPIC = "finance.cashflows"


def on_cashflow(payload):
    """Consumed from Accounting. data cashflow, frequency monthly."""
    return {
        "peer": "Accounting",
        "channel": TOPIC,
        "data": DATA_CASHFLOW,
        "frequency": FREQUENCY_MONTHLY,
        "payload": payload,
    }
