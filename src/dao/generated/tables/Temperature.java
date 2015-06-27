/**
 * This class is generated by jOOQ
 */
package dao.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Temperature extends org.jooq.impl.TableImpl<dao.generated.tables.records.TemperatureRecord> {

	private static final long serialVersionUID = 1727085496;

	/**
	 * The singleton instance of <code>temperature</code>
	 */
	public static final dao.generated.tables.Temperature TEMPERATURE = new dao.generated.tables.Temperature();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<dao.generated.tables.records.TemperatureRecord> getRecordType() {
		return dao.generated.tables.records.TemperatureRecord.class;
	}

	/**
	 * The column <code>temperature.addr</code>.
	 */
	public final org.jooq.TableField<dao.generated.tables.records.TemperatureRecord, java.lang.String> ADDR = createField("addr", org.jooq.impl.SQLDataType.CHAR.length(4).nullable(false), this, "");

	/**
	 * The column <code>temperature.time</code>.
	 */
	public final org.jooq.TableField<dao.generated.tables.records.TemperatureRecord, java.lang.Object> TIME = createField("time", org.jooq.impl.DefaultDataType.getDefaultDataType("long"), this, "");

	/**
	 * The column <code>temperature.temperature</code>.
	 */
	public final org.jooq.TableField<dao.generated.tables.records.TemperatureRecord, java.lang.Float> TEMPERATURE_ = createField("temperature", org.jooq.impl.SQLDataType.REAL.defaulted(true), this, "");

	/**
	 * Create a <code>temperature</code> table reference
	 */
	public Temperature() {
		this("temperature", null);
	}

	/**
	 * Create an aliased <code>temperature</code> table reference
	 */
	public Temperature(java.lang.String alias) {
		this(alias, dao.generated.tables.Temperature.TEMPERATURE);
	}

	private Temperature(java.lang.String alias, org.jooq.Table<dao.generated.tables.records.TemperatureRecord> aliased) {
		this(alias, aliased, null);
	}

	private Temperature(java.lang.String alias, org.jooq.Table<dao.generated.tables.records.TemperatureRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, dao.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<dao.generated.tables.records.TemperatureRecord> getPrimaryKey() {
		return dao.generated.Keys.PK_TEMPERATURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<dao.generated.tables.records.TemperatureRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<dao.generated.tables.records.TemperatureRecord>>asList(dao.generated.Keys.PK_TEMPERATURE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public dao.generated.tables.Temperature as(java.lang.String alias) {
		return new dao.generated.tables.Temperature(alias, this);
	}

	/**
	 * Rename this table
	 */
	public dao.generated.tables.Temperature rename(java.lang.String name) {
		return new dao.generated.tables.Temperature(name, null);
	}
}