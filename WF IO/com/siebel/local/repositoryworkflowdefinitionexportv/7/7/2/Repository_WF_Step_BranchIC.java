package com.siebel.local.repositoryworkflowdefinitionexportv.7.7.2;


/* 
 * -- AUTOMATICALLY GENERATED FROM SIEBEL TOOLS -- 
 * Copyright (C) 2000, Siebel Systems Incorporated, All rights reserved. 
 * 
 * MODIFICATION OR EXTENSION OF THIS CODE SHALL VOID ANY APPLICABLE 
 * WARRANTIES AND MAINTENANCE SUPPORT.
 * 
 * Generated from Siebel Java (JDB) Code Generator 
 * Repository        : Siebel Repository 
 * Generated Date    : Thu Aug 25 15:02:29 2011
 */


/* import classes we need. */ 
import java.io.Serializable;  
import java.util.Vector; 
import java.util.Enumeration; 

import com.siebel.data.SiebelException; 
import com.siebel.data.SiebelExceptionConstants; 
import com.siebel.data.SiebelPropertySet; 
import com.siebel.data.SiebelDataBean; 

import com.siebel.integration.util.SiebelHierarchy; 
import com.siebel.integration.util.SiebelHierarchyImpl; 
import com.siebel.integration.adapter.SiebelJDBAdapterBase;



/**
 *  
 * 
 * Generated from Siebel Java (JDB) Code Generator 
 * @author Siebel Systems, Inc. 
 * @see Siebel Code Generator 
 **/ 

public    class Repository_WF_Step_BranchIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Step Branch";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FCOUNT_PROPERTY  =  "Count";
  protected static final String  FEVALUATE_SEQUENCE_PROPERTY  =  "Evaluate Sequence";
  protected static final String  FEVENT_PROPERTY  =  "Event";
  protected static final String  FEVENT_CANCEL_FLAG_PROPERTY  =  "Event Cancel Flag";
  protected static final String  FEVENT_OBJECT_PROPERTY  =  "Event Object";
  protected static final String  FEVENT_OBJECT_TYPE_PROPERTY  =  "Event Object Type";
  protected static final String  FEVENT_VISIBILITY_PROPERTY  =  "Event Visibility";
  protected static final String  FEXPRESSION_PROPERTY  =  "Expression";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FSUBEVENT_PROPERTY  =  "Subevent";
  protected static final String  FTIME_LIMIT_PROPERTY  =  "Time Limit";
  protected static final String  FTYPE_PROPERTY  =  "Type";
  protected static final String  FUSER_EVENT_NAME_PROPERTY  =  "User Event Name";
  protected static final String  FUSER_EVENT_STORAGE_PROPERTY  =  "User Event Storage";
  protected static final String  FUSER_EVENT_TIMEOUT_PROPERTY  =  "User Event Timeout";
  protected static final String  FREPOSITORY_WF_BRANCH_CRITERIAIC_PROPERTY  =  "Repository WF Branch Criteria";

  /* default constructor */ 
  public Repository_WF_Step_BranchIC()  { 
    super(); 
  }/* public Repository_WF_Step_BranchIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Step_BranchIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Step_BranchIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fCount != null) {
      hash = HASH_PRIME * hash + fCount.hashCode(); 
    }/* if */

    if(fEvaluate_Sequence != null) {
      hash = HASH_PRIME * hash + fEvaluate_Sequence.hashCode(); 
    }/* if */

    if(fEvent != null) {
      hash = HASH_PRIME * hash + fEvent.hashCode(); 
    }/* if */

    if(fEvent_Cancel_Flag != null) {
      hash = HASH_PRIME * hash + fEvent_Cancel_Flag.hashCode(); 
    }/* if */

    if(fEvent_Object != null) {
      hash = HASH_PRIME * hash + fEvent_Object.hashCode(); 
    }/* if */

    if(fEvent_Object_Type != null) {
      hash = HASH_PRIME * hash + fEvent_Object_Type.hashCode(); 
    }/* if */

    if(fEvent_Visibility != null) {
      hash = HASH_PRIME * hash + fEvent_Visibility.hashCode(); 
    }/* if */

    if(fExpression != null) {
      hash = HASH_PRIME * hash + fExpression.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fSubevent != null) {
      hash = HASH_PRIME * hash + fSubevent.hashCode(); 
    }/* if */

    if(fTime_Limit != null) {
      hash = HASH_PRIME * hash + fTime_Limit.hashCode(); 
    }/* if */

    if(fType != null) {
      hash = HASH_PRIME * hash + fType.hashCode(); 
    }/* if */

    if(fUser_Event_Name != null) {
      hash = HASH_PRIME * hash + fUser_Event_Name.hashCode(); 
    }/* if */

    if(fUser_Event_Storage != null) {
      hash = HASH_PRIME * hash + fUser_Event_Storage.hashCode(); 
    }/* if */

    if(fUser_Event_Timeout != null) {
      hash = HASH_PRIME * hash + fUser_Event_Timeout.hashCode(); 
    }/* if */

    if(fRepository_WF_Branch_CriteriaIC != null) {
      for(int i = 0; i < fRepository_WF_Branch_CriteriaIC.size(); ++i) { 
        Repository_WF_Branch_CriteriaIC  tmp = (Repository_WF_Branch_CriteriaIC)fRepository_WF_Branch_CriteriaIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Step_BranchIC o = (Repository_WF_Step_BranchIC)object;

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fCount == null) { 
       if(o.fCount != null) return false; 
    }else if(! fCount.equals(o.fCount)) return false; 

    if(fEvaluate_Sequence == null) { 
       if(o.fEvaluate_Sequence != null) return false; 
    }else if(! fEvaluate_Sequence.equals(o.fEvaluate_Sequence)) return false; 

    if(fEvent == null) { 
       if(o.fEvent != null) return false; 
    }else if(! fEvent.equals(o.fEvent)) return false; 

    if(fEvent_Cancel_Flag == null) { 
       if(o.fEvent_Cancel_Flag != null) return false; 
    }else if(! fEvent_Cancel_Flag.equals(o.fEvent_Cancel_Flag)) return false; 

    if(fEvent_Object == null) { 
       if(o.fEvent_Object != null) return false; 
    }else if(! fEvent_Object.equals(o.fEvent_Object)) return false; 

    if(fEvent_Object_Type == null) { 
       if(o.fEvent_Object_Type != null) return false; 
    }else if(! fEvent_Object_Type.equals(o.fEvent_Object_Type)) return false; 

    if(fEvent_Visibility == null) { 
       if(o.fEvent_Visibility != null) return false; 
    }else if(! fEvent_Visibility.equals(o.fEvent_Visibility)) return false; 

    if(fExpression == null) { 
       if(o.fExpression != null) return false; 
    }else if(! fExpression.equals(o.fExpression)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fSubevent == null) { 
       if(o.fSubevent != null) return false; 
    }else if(! fSubevent.equals(o.fSubevent)) return false; 

    if(fTime_Limit == null) { 
       if(o.fTime_Limit != null) return false; 
    }else if(! fTime_Limit.equals(o.fTime_Limit)) return false; 

    if(fType == null) { 
       if(o.fType != null) return false; 
    }else if(! fType.equals(o.fType)) return false; 

    if(fUser_Event_Name == null) { 
       if(o.fUser_Event_Name != null) return false; 
    }else if(! fUser_Event_Name.equals(o.fUser_Event_Name)) return false; 

    if(fUser_Event_Storage == null) { 
       if(o.fUser_Event_Storage != null) return false; 
    }else if(! fUser_Event_Storage.equals(o.fUser_Event_Storage)) return false; 

    if(fUser_Event_Timeout == null) { 
       if(o.fUser_Event_Timeout != null) return false; 
    }else if(! fUser_Event_Timeout.equals(o.fUser_Event_Timeout)) return false; 

    if((fRepository_WF_Branch_CriteriaIC != null) && (o.fRepository_WF_Branch_CriteriaIC != null)) { 
      if(fRepository_WF_Branch_CriteriaIC.size() != o.fRepository_WF_Branch_CriteriaIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Branch_CriteriaIC.size(); ++i) { 
         if(! fRepository_WF_Branch_CriteriaIC.get(i).equals(o.fRepository_WF_Branch_CriteriaIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Branch_CriteriaIC != o.fRepository_WF_Branch_CriteriaIC) return false;
    }/* if */

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Step_BranchIC result = (Repository_WF_Step_BranchIC) super.clone();

      if(fRepository_WF_Branch_CriteriaIC != null) {
        result.fRepository_WF_Branch_CriteriaIC = (Vector)fRepository_WF_Branch_CriteriaIC.clone(); 

        for(int i = 0; i < fRepository_WF_Branch_CriteriaIC.size(); ++i) {   
          Repository_WF_Branch_CriteriaIC   elem  = (Repository_WF_Branch_CriteriaIC)fRepository_WF_Branch_CriteriaIC.elementAt(i); 

          result.fRepository_WF_Branch_CriteriaIC.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fCount != null)   
      ps.setProperty("Count", fCount); 

    if(fEvaluate_Sequence != null)   
      ps.setProperty("Evaluate Sequence", fEvaluate_Sequence); 

    if(fEvent != null)   
      ps.setProperty("Event", fEvent); 

    if(fEvent_Cancel_Flag != null)   
      ps.setProperty("Event Cancel Flag", fEvent_Cancel_Flag); 

    if(fEvent_Object != null)   
      ps.setProperty("Event Object", fEvent_Object); 

    if(fEvent_Object_Type != null)   
      ps.setProperty("Event Object Type", fEvent_Object_Type); 

    if(fEvent_Visibility != null)   
      ps.setProperty("Event Visibility", fEvent_Visibility); 

    if(fExpression != null)   
      ps.setProperty("Expression", fExpression); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fSubevent != null)   
      ps.setProperty("Subevent", fSubevent); 

    if(fTime_Limit != null)   
      ps.setProperty("Time Limit", fTime_Limit); 

    if(fType != null)   
      ps.setProperty("Type", fType); 

    if(fUser_Event_Name != null)   
      ps.setProperty("User Event Name", fUser_Event_Name); 

    if(fUser_Event_Storage != null)   
      ps.setProperty("User Event Storage", fUser_Event_Storage); 

    if(fUser_Event_Timeout != null)   
      ps.setProperty("User Event Timeout", fUser_Event_Timeout); 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Branch_CriteriaIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Branch_CriteriaIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Branch Criteria");

        for(int i = 0; i < fRepository_WF_Branch_CriteriaIC.size(); ++i) { 
          Repository_WF_Branch_CriteriaIC temp = (Repository_WF_Branch_CriteriaIC)  fRepository_WF_Branch_CriteriaIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Branch_CriteriaIC != null) {
        for(int i = 0; i < fRepository_WF_Branch_CriteriaIC.size(); ++i) {   
          Repository_WF_Branch_CriteriaIC temp = (Repository_WF_Branch_CriteriaIC)  fRepository_WF_Branch_CriteriaIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fComments = ps.getProperty("Comments");
      fCount = ps.getProperty("Count");
      fEvaluate_Sequence = ps.getProperty("Evaluate Sequence");
      fEvent = ps.getProperty("Event");
      fEvent_Cancel_Flag = ps.getProperty("Event Cancel Flag");
      fEvent_Object = ps.getProperty("Event Object");
      fEvent_Object_Type = ps.getProperty("Event Object Type");
      fEvent_Visibility = ps.getProperty("Event Visibility");
      fExpression = ps.getProperty("Expression");
      fInactive = ps.getProperty("Inactive");
      fName = ps.getProperty("Name");
      fSubevent = ps.getProperty("Subevent");
      fTime_Limit = ps.getProperty("Time Limit");
      fType = ps.getProperty("Type");
      fUser_Event_Name = ps.getProperty("User Event Name");
      fUser_Event_Storage = ps.getProperty("User Event Storage");
      fUser_Event_Timeout = ps.getProperty("User Event Timeout");
      fRepository_WF_Branch_CriteriaIC = null;

      for(int i = 0; i < ps.getChildCount(); ++i) {
        SiebelPropertySet  childPs = ps.getChild(i);

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Branch Criteria")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Branch_CriteriaIC tmp = new Repository_WF_Branch_CriteriaIC(childPs.getChild(j)); 

              addfRepository_WF_Branch_CriteriaIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Branch Criteria")) { 
              Repository_WF_Branch_CriteriaIC tmp = new Repository_WF_Branch_CriteriaIC(childPs);    

              addfRepository_WF_Branch_CriteriaIC(tmp);
          }/* if */ 
        }/* if */  

      }/* for */
    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fCount */
  public     String getfCount() { 
    return fCount; 
  }/* public     String getfCount(...) */ 

  public     void setfCount(String val) { 
    fCount = val; 
  }/* public     void setfCount(...) */  


  /* access methods for fEvaluate_Sequence */
  public     String getfEvaluate_Sequence() { 
    return fEvaluate_Sequence; 
  }/* public     String getfEvaluate_Sequence(...) */ 

  public     void setfEvaluate_Sequence(String val) { 
    fEvaluate_Sequence = val; 
  }/* public     void setfEvaluate_Sequence(...) */  


  /* access methods for fEvent */
  public     String getfEvent() { 
    return fEvent; 
  }/* public     String getfEvent(...) */ 

  public     void setfEvent(String val) { 
    fEvent = val; 
  }/* public     void setfEvent(...) */  


  /* access methods for fEvent_Cancel_Flag */
  public     String getfEvent_Cancel_Flag() { 
    return fEvent_Cancel_Flag; 
  }/* public     String getfEvent_Cancel_Flag(...) */ 

  public     void setfEvent_Cancel_Flag(String val) { 
    fEvent_Cancel_Flag = val; 
  }/* public     void setfEvent_Cancel_Flag(...) */  


  /* access methods for fEvent_Object */
  public     String getfEvent_Object() { 
    return fEvent_Object; 
  }/* public     String getfEvent_Object(...) */ 

  public     void setfEvent_Object(String val) { 
    fEvent_Object = val; 
  }/* public     void setfEvent_Object(...) */  


  /* access methods for fEvent_Object_Type */
  public     String getfEvent_Object_Type() { 
    return fEvent_Object_Type; 
  }/* public     String getfEvent_Object_Type(...) */ 

  public     void setfEvent_Object_Type(String val) { 
    fEvent_Object_Type = val; 
  }/* public     void setfEvent_Object_Type(...) */  


  /* access methods for fEvent_Visibility */
  public     String getfEvent_Visibility() { 
    return fEvent_Visibility; 
  }/* public     String getfEvent_Visibility(...) */ 

  public     void setfEvent_Visibility(String val) { 
    fEvent_Visibility = val; 
  }/* public     void setfEvent_Visibility(...) */  


  /* access methods for fExpression */
  public     String getfExpression() { 
    return fExpression; 
  }/* public     String getfExpression(...) */ 

  public     void setfExpression(String val) { 
    fExpression = val; 
  }/* public     void setfExpression(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fSubevent */
  public     String getfSubevent() { 
    return fSubevent; 
  }/* public     String getfSubevent(...) */ 

  public     void setfSubevent(String val) { 
    fSubevent = val; 
  }/* public     void setfSubevent(...) */  


  /* access methods for fTime_Limit */
  public     String getfTime_Limit() { 
    return fTime_Limit; 
  }/* public     String getfTime_Limit(...) */ 

  public     void setfTime_Limit(String val) { 
    fTime_Limit = val; 
  }/* public     void setfTime_Limit(...) */  


  /* access methods for fType */
  public     String getfType() { 
    return fType; 
  }/* public     String getfType(...) */ 

  public     void setfType(String val) { 
    fType = val; 
  }/* public     void setfType(...) */  


  /* access methods for fUser_Event_Name */
  public     String getfUser_Event_Name() { 
    return fUser_Event_Name; 
  }/* public     String getfUser_Event_Name(...) */ 

  public     void setfUser_Event_Name(String val) { 
    fUser_Event_Name = val; 
  }/* public     void setfUser_Event_Name(...) */  


  /* access methods for fUser_Event_Storage */
  public     String getfUser_Event_Storage() { 
    return fUser_Event_Storage; 
  }/* public     String getfUser_Event_Storage(...) */ 

  public     void setfUser_Event_Storage(String val) { 
    fUser_Event_Storage = val; 
  }/* public     void setfUser_Event_Storage(...) */  


  /* access methods for fUser_Event_Timeout */
  public     String getfUser_Event_Timeout() { 
    return fUser_Event_Timeout; 
  }/* public     String getfUser_Event_Timeout(...) */ 

  public     void setfUser_Event_Timeout(String val) { 
    fUser_Event_Timeout = val; 
  }/* public     void setfUser_Event_Timeout(...) */  


  /* access methods for fRepository_WF_Branch_CriteriaIC */
  public     Vector getfRepository_WF_Branch_CriteriaIC() {     
    if(fRepository_WF_Branch_CriteriaIC != null) {
      return (Vector)fRepository_WF_Branch_CriteriaIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Branch_CriteriaIC(...) */ 

  public     void addfRepository_WF_Branch_CriteriaIC(Repository_WF_Branch_CriteriaIC val) { 
    if(val != null) {
      if(fRepository_WF_Branch_CriteriaIC == null) { 
        fRepository_WF_Branch_CriteriaIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Branch_CriteriaIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Branch_CriteriaIC(...) */ 

  public     void clearfRepository_WF_Branch_CriteriaIC() { 
    if(fRepository_WF_Branch_CriteriaIC != null) { 
      fRepository_WF_Branch_CriteriaIC.removeAllElements(); 
      fRepository_WF_Branch_CriteriaIC = null;
    }/* if */ 

    fRepository_WF_Branch_CriteriaIC = new Vector();
  }/* public     void clearfRepository_WF_Branch_CriteriaIC(...) */ 

  public     void removefRepository_WF_Branch_CriteriaIC() { 
    if(fRepository_WF_Branch_CriteriaIC != null) { 
      fRepository_WF_Branch_CriteriaIC.removeAllElements(); 
      fRepository_WF_Branch_CriteriaIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Branch_CriteriaIC(...) */ 




  /* member variables */
  protected String  fComments = null;
  protected String  fCount = null;
  protected String  fEvaluate_Sequence = null;
  protected String  fEvent = null;
  protected String  fEvent_Cancel_Flag = null;
  protected String  fEvent_Object = null;
  protected String  fEvent_Object_Type = null;
  protected String  fEvent_Visibility = null;
  protected String  fExpression = null;
  protected String  fInactive = null;
  protected String  fName = null;
  protected String  fSubevent = null;
  protected String  fTime_Limit = null;
  protected String  fType = null;
  protected String  fUser_Event_Name = null;
  protected String  fUser_Event_Storage = null;
  protected String  fUser_Event_Timeout = null;
  protected Vector  fRepository_WF_Branch_CriteriaIC = null;
}/* Repository_WF_Step_BranchIC */






