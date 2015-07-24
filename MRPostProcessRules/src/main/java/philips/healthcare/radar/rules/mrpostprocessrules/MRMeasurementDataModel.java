package philips.healthcare.radar.rules.mrpostprocessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class MRMeasurementDataModel implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("HeliumValue")
   private int mHeliumValue;

   @org.kie.api.definition.type.Label("RoomTemperatureValue")
   private int mRoomTemperatureValue;

   @org.kie.api.definition.type.Label("HeliumOOS")
   private java.lang.Boolean mIsHeliumOOS;

   private int HELIUMOOSLIMIT;

   @org.kie.api.definition.type.Label("NumberDaysWithoutConnection")
   private int numberDaysWithoutConnection;

   @org.kie.api.definition.type.Label("ConnectivitySeverity")
   private java.lang.String connectivitySeverity;

   @org.kie.api.definition.type.Label("HeliumLevel")
   private java.lang.Integer heliumLevel;

   @org.kie.api.definition.type.Label("HeliumBoilOff")
   private Double heliumBoilOff;

   @org.kie.api.definition.type.Label("MagnetType")
   private java.lang.String magnetType;

   @org.kie.api.definition.type.Label("HeliumPressure")
   private java.lang.Integer heliumPressure;

   @org.kie.api.definition.type.Label("SpecificationIndexIsOutOfSpec")
   private java.lang.Boolean specificationIndexIsOutOfSpec;

   @org.kie.api.definition.type.Label("MTBC")
   private java.lang.Integer MTBC;

   @org.kie.api.definition.type.Label("HwErrorsLastWeek")
   private java.lang.Integer hwErrorsLastWeek;

   @org.kie.api.definition.type.Label("CoolingHoursOutOfSpec")
   private java.lang.Integer coolingHoursOutOfSpec;

   @org.kie.api.definition.type.Label("CoolingSeverity")
   private java.lang.String coolingSeverity;

   @org.kie.api.definition.type.Label("ClimateHoursOutOfSpec")
   private java.lang.Integer climateHoursOutOfSpec;

   @org.kie.api.definition.type.Label("ClimateSeverity")
   private java.lang.String climateSeverity;

   @org.kie.api.definition.type.Label("IQTQualityAssuranceOutOfSpec")
   private java.lang.Integer IQTQualityAssuranceOutOfSpec;

   @org.kie.api.definition.type.Label("IQTQualityAssuranceSeverity")
   private java.lang.String IQTQualityAssuranceSeverity;

   @org.kie.api.definition.type.Label(value = "DeviceConfig")
   private philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig deviceConfig;

   public MRMeasurementDataModel()
   {
   }

   public int getmHeliumValue()
   {
      return this.mHeliumValue;
   }

   public void setmHeliumValue(int mHeliumValue)
   {
      this.mHeliumValue = mHeliumValue;
   }

   public int getmRoomTemperatureValue()
   {
      return this.mRoomTemperatureValue;
   }

   public void setmRoomTemperatureValue(int mRoomTemperatureValue)
   {
      this.mRoomTemperatureValue = mRoomTemperatureValue;
   }

   public java.lang.Boolean getmIsHeliumOOS()
   {
      return this.mIsHeliumOOS;
   }

   public void setmIsHeliumOOS(java.lang.Boolean mIsHeliumOOS)
   {
      this.mIsHeliumOOS = mIsHeliumOOS;
   }

   public int getHELIUMOOSLIMIT()
   {
      return this.HELIUMOOSLIMIT;
   }

   public void setHELIUMOOSLIMIT(int HELIUMOOSLIMIT)
   {
      this.HELIUMOOSLIMIT = HELIUMOOSLIMIT;
   }

   public int getNumberDaysWithoutConnection()
   {
      return this.numberDaysWithoutConnection;
   }

   public void setNumberDaysWithoutConnection(int numberDaysWithoutConnection)
   {
      this.numberDaysWithoutConnection = numberDaysWithoutConnection;
   }

   public java.lang.String getConnectivitySeverity()
   {
      return this.connectivitySeverity;
   }

   public void setConnectivitySeverity(java.lang.String connectivitySeverity)
   {
      this.connectivitySeverity = connectivitySeverity;
   }

   public java.lang.Integer getHeliumLevel()
   {
      return this.heliumLevel;
   }

   public void setHeliumLevel(java.lang.Integer heliumLevel)
   {
      this.heliumLevel = heliumLevel;
   }

   public java.lang.String getMagnetType()
   {
      return this.magnetType;
   }

   public void setMagnetType(java.lang.String magnetType)
   {
      this.magnetType = magnetType;
   }

   public java.lang.Integer getHeliumPressure()
   {
      return this.heliumPressure;
   }

   public void setHeliumPressure(java.lang.Integer heliumPressure)
   {
      this.heliumPressure = heliumPressure;
   }

   public java.lang.Boolean getSpecificationIndexIsOutOfSpec()
   {
      return this.specificationIndexIsOutOfSpec;
   }

   public void setSpecificationIndexIsOutOfSpec(
         java.lang.Boolean specificationIndexIsOutOfSpec)
   {
      this.specificationIndexIsOutOfSpec = specificationIndexIsOutOfSpec;
   }

   public java.lang.Integer getMTBC()
   {
      return this.MTBC;
   }

   public void setMTBC(java.lang.Integer MTBC)
   {
      this.MTBC = MTBC;
   }

   public java.lang.Integer getHwErrorsLastWeek()
   {
      return this.hwErrorsLastWeek;
   }

   public void setHwErrorsLastWeek(java.lang.Integer hwErrorsLastWeek)
   {
      this.hwErrorsLastWeek = hwErrorsLastWeek;
   }

   public java.lang.Integer getCoolingHoursOutOfSpec()
   {
      return this.coolingHoursOutOfSpec;
   }

   public void setCoolingHoursOutOfSpec(java.lang.Integer coolingHoursOutOfSpec)
   {
      this.coolingHoursOutOfSpec = coolingHoursOutOfSpec;
   }

   public java.lang.String getCoolingSeverity()
   {
      return this.coolingSeverity;
   }

   public void setCoolingSeverity(java.lang.String coolingSeverity)
   {
      this.coolingSeverity = coolingSeverity;
   }

   public java.lang.Integer getClimateHoursOutOfSpec()
   {
      return this.climateHoursOutOfSpec;
   }

   public void setClimateHoursOutOfSpec(java.lang.Integer climateHoursOutOfSpec)
   {
      this.climateHoursOutOfSpec = climateHoursOutOfSpec;
   }

   public java.lang.String getClimateSeverity()
   {
      return this.climateSeverity;
   }

   public void setClimateSeverity(java.lang.String climateSeverity)
   {
      this.climateSeverity = climateSeverity;
   }

   public java.lang.Integer getIQTQualityAssuranceOutOfSpec()
   {
      return this.IQTQualityAssuranceOutOfSpec;
   }

   public void setIQTQualityAssuranceOutOfSpec(
         java.lang.Integer IQTQualityAssuranceOutOfSpec)
   {
      this.IQTQualityAssuranceOutOfSpec = IQTQualityAssuranceOutOfSpec;
   }

   public java.lang.String getIQTQualityAssuranceSeverity()
   {
      return this.IQTQualityAssuranceSeverity;
   }

   public void setIQTQualityAssuranceSeverity(
         java.lang.String IQTQualityAssuranceSeverity)
   {
      this.IQTQualityAssuranceSeverity = IQTQualityAssuranceSeverity;
   }

   public java.lang.Double getHeliumBoilOff()
   {
      return this.heliumBoilOff;
   }

   public void setHeliumBoilOff(java.lang.Double heliumBoilOff)
   {
      this.heliumBoilOff = heliumBoilOff;
   }

   public philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig getDeviceConfig()
   {
      return this.deviceConfig;
   }

   public void setDeviceConfig(
         philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig deviceConfig)
   {
      this.deviceConfig = deviceConfig;
   }

   public MRMeasurementDataModel(
         int mHeliumValue,
         int mRoomTemperatureValue,
         java.lang.Boolean mIsHeliumOOS,
         int HELIUMOOSLIMIT,
         int numberDaysWithoutConnection,
         java.lang.String connectivitySeverity,
         java.lang.Integer heliumLevel,
         java.lang.Double heliumBoilOff,
         java.lang.String magnetType,
         java.lang.Integer heliumPressure,
         java.lang.Boolean specificationIndexIsOutOfSpec,
         java.lang.Integer MTBC,
         java.lang.Integer hwErrorsLastWeek,
         java.lang.Integer coolingHoursOutOfSpec,
         java.lang.String coolingSeverity,
         java.lang.Integer climateHoursOutOfSpec,
         java.lang.String climateSeverity,
         java.lang.Integer IQTQualityAssuranceOutOfSpec,
         java.lang.String IQTQualityAssuranceSeverity,
         philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig deviceConfig)
   {
      this.mHeliumValue = mHeliumValue;
      this.mRoomTemperatureValue = mRoomTemperatureValue;
      this.mIsHeliumOOS = mIsHeliumOOS;
      this.HELIUMOOSLIMIT = HELIUMOOSLIMIT;
      this.numberDaysWithoutConnection = numberDaysWithoutConnection;
      this.connectivitySeverity = connectivitySeverity;
      this.heliumLevel = heliumLevel;
      this.heliumBoilOff = heliumBoilOff;
      this.magnetType = magnetType;
      this.heliumPressure = heliumPressure;
      this.specificationIndexIsOutOfSpec = specificationIndexIsOutOfSpec;
      this.MTBC = MTBC;
      this.hwErrorsLastWeek = hwErrorsLastWeek;
      this.coolingHoursOutOfSpec = coolingHoursOutOfSpec;
      this.coolingSeverity = coolingSeverity;
      this.climateHoursOutOfSpec = climateHoursOutOfSpec;
      this.climateSeverity = climateSeverity;
      this.IQTQualityAssuranceOutOfSpec = IQTQualityAssuranceOutOfSpec;
      this.IQTQualityAssuranceSeverity = IQTQualityAssuranceSeverity;
      this.deviceConfig = deviceConfig;
   }

}