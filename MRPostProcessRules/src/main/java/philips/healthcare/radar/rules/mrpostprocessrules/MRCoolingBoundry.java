package philips.healthcare.radar.rules.mrpostprocessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MRCoolingBoundry implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int minValue;

   private int maxValue;

   private philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig deviceConfig;

   public MRCoolingBoundry()
   {
   }

   public int getMinValue()
   {
      return this.minValue;
   }

   public void setMinValue(int minValue)
   {
      this.minValue = minValue;
   }

   public int getMaxValue()
   {
      return this.maxValue;
   }

   public void setMaxValue(int maxValue)
   {
      this.maxValue = maxValue;
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

   public MRCoolingBoundry(
         int minValue,
         int maxValue,
         philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig deviceConfig)
   {
      this.minValue = minValue;
      this.maxValue = maxValue;
      this.deviceConfig = deviceConfig;
   }

}