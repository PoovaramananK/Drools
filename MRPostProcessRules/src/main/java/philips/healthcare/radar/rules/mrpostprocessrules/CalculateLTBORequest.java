package philips.healthcare.radar.rules.mrpostprocessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CalculateLTBORequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Config")
   private philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig config;
   @org.kie.api.definition.type.Label(value = "HeliumLevelList")
   private philips.healthcare.radar.rules.mrpostprocessrules.HeliumMeasurement heliumLevelList;

   public CalculateLTBORequest()
   {
   }

   public philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig getConfig()
   {
      return this.config;
   }

   public void setConfig(
         philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig config)
   {
      this.config = config;
   }

   public philips.healthcare.radar.rules.mrpostprocessrules.HeliumMeasurement getHeliumLevelList()
   {
      return this.heliumLevelList;
   }

   public void setHeliumLevelList(
         philips.healthcare.radar.rules.mrpostprocessrules.HeliumMeasurement heliumLevelList)
   {
      this.heliumLevelList = heliumLevelList;
   }

   public CalculateLTBORequest(
         philips.healthcare.radar.rules.mrpostprocessrules.MRDeviceConfig config,
         philips.healthcare.radar.rules.mrpostprocessrules.HeliumMeasurement heliumLevelList)
   {
      this.config = config;
      this.heliumLevelList = heliumLevelList;
   }

}