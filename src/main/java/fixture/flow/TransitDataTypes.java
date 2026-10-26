package fixture.flow;

/**
 * Edge attributes on Finance flows.
 * grep: data frequency cashflow monthly
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Finance. */
  public static final String BUSINESS_FUNCTION = "MANAGEMENT_REPORTING";

  /** Node attribute pillar for Finance. */
  public static final String PILLAR = "Finance";

  public static final String DATA_CASHFLOW = "cashflow";
  public static final String FREQUENCY_MONTHLY = "monthly";

  private TransitDataTypes() {}
}
