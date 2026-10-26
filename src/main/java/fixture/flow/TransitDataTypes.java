package fixture.flow;

/**
 * Data categories ingested by Finance.
 * grep: PNL_PACK LEDGER_BALANCE
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Finance. */
  public static final String BUSINESS_FUNCTION = "MANAGEMENT_REPORTING";

  /** Node attribute pillar for Finance. */
  public static final String PILLAR = "Finance";

  public static final String API_PNL_PACK = "PNL_PACK";
  public static final String KAFKA_LEDGER_BALANCE = "LEDGER_BALANCE";

  public static final String API_PAYLOAD_FORMAT = "JSON";
  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";

  private TransitDataTypes() {}
}
