package philips.healthcare.radar.rules.mrpostprocessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class HeliumMeasurement implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Date")
   private java.util.Date date;
   @org.kie.api.definition.type.Label(value = "UpperLevel")
   private java.lang.Float upperLevel;
   @org.kie.api.definition.type.Label(value = "LowerLevel")
   private java.lang.Float lowerLevel;
   @org.kie.api.definition.type.Label(value = "HeliumLevel")
   private java.lang.Float heliumLevel;

   public HeliumMeasurement()
   {
   }

   public java.util.Date getDate()
   {
      return this.date;
   }

   public void setDate(java.util.Date date)
   {
      this.date = date;
   }

   public java.lang.Float getUpperLevel()
   {
      return this.upperLevel;
   }

   public void setUpperLevel(java.lang.Float upperLevel)
   {
      this.upperLevel = upperLevel;
   }

   public java.lang.Float getLowerLevel()
   {
      return this.lowerLevel;
   }

   public void setLowerLevel(java.lang.Float lowerLevel)
   {
      this.lowerLevel = lowerLevel;
   }

   public java.lang.Float getHeliumLevel()
   {
      return this.heliumLevel;
   }

   public void setHeliumLevel(java.lang.Float heliumLevel)
   {
      this.heliumLevel = heliumLevel;
   }

   public HeliumMeasurement(java.util.Date date, java.lang.Float upperLevel,
         java.lang.Float lowerLevel, java.lang.Float heliumLevel)
   {
      this.date = date;
      this.upperLevel = upperLevel;
      this.lowerLevel = lowerLevel;
      this.heliumLevel = heliumLevel;
   }

}