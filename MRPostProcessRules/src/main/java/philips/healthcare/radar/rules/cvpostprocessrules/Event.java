package philips.healthcare.radar.rules.cvpostprocessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class Event implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("EventID")
   private java.lang.String eventID;
   @org.kie.api.definition.type.Label("Description")
   private java.lang.String description;
   @org.kie.api.definition.type.Label("AdditionalInfo")
   private java.lang.String additionalInfo;
   @org.kie.api.definition.type.Label("Category")
   private java.lang.String category;

   @org.kie.api.definition.type.Label(value = "TimeStamp")
   private java.util.Date timeStamp;

   public Event()
   {
   }

   public java.lang.String getEventID()
   {
      return this.eventID;
   }

   public void setEventID(java.lang.String eventID)
   {
      this.eventID = eventID;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.String getAdditionalInfo()
   {
      return this.additionalInfo;
   }

   public void setAdditionalInfo(java.lang.String additionalInfo)
   {
      this.additionalInfo = additionalInfo;
   }

   public java.lang.String getCategory()
   {
      return this.category;
   }

   public void setCategory(java.lang.String category)
   {
      this.category = category;
   }

   public java.util.Date getTimeStamp()
   {
      return this.timeStamp;
   }

   public void setTimeStamp(java.util.Date timeStamp)
   {
      this.timeStamp = timeStamp;
   }

   public Event(java.lang.String eventID, java.lang.String description,
         java.lang.String additionalInfo, java.lang.String category,
         java.util.Date timeStamp)
   {
      this.eventID = eventID;
      this.description = description;
      this.additionalInfo = additionalInfo;
      this.category = category;
      this.timeStamp = timeStamp;
   }

}