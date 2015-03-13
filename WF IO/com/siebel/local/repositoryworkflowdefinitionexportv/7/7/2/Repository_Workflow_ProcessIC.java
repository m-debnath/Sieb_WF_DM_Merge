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

public    class Repository_Workflow_ProcessIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository Workflow Process";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FBUSINESS_OBJECT_PROPERTY  =  "Business Object";
  protected static final String  FCACHE_LOCALE_PROPERTY  =  "Cache Locale";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FDESCRIPTION_PROPERTY  =  "Description";
  protected static final String  FEFFECTIVE_END_DATE_PROPERTY  =  "Effective End Date";
  protected static final String  FEFFECTIVE_START_DATE_PROPERTY  =  "Effective Start Date";
  protected static final String  FERROR_PROCESS_NAME_PROPERTY  =  "Error Process Name";
  protected static final String  FGROUP_PROPERTY  =  "Group";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FMODULE_PROPERTY  =  "Module";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FPERSISTENT_FREQUENCY_PROPERTY  =  "Persistent Frequency";
  protected static final String  FPERSISTENT_LEVEL_PROPERTY  =  "Persistent Level";
  protected static final String  FPROCESS_NAME_PROPERTY  =  "Process Name";
  protected static final String  FPROJECT_NAME_PROPERTY  =  "Project Name";
  protected static final String  FREPLICATION_LEVEL_PROPERTY  =  "Replication Level";
  protected static final String  FRUNNABLE_PROPERTY  =  "Runnable";
  protected static final String  FSTATUS_PROPERTY  =  "Status";
  protected static final String  FVERSION_PROPERTY  =  "Version";
  protected static final String  FWORKFLOW_MODE_PROPERTY  =  "Workflow Mode";
  protected static final String  FREPOSITORY_WF_BRANCH_CONNECTORIC_PROPERTY  =  "Repository WF Branch Connector";
  protected static final String  FREPOSITORY_WF_PROCESS_PROPIC_PROPERTY  =  "Repository WF Process Prop";
  protected static final String  FREPOSITORY_WF_STEPIC_PROPERTY  =  "Repository WF Step";

  /* default constructor */ 
  public Repository_Workflow_ProcessIC()  { 
    super(); 
  }/* public Repository_Workflow_ProcessIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_Workflow_ProcessIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_Workflow_ProcessIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fBusiness_Object != null) {
      hash = HASH_PRIME * hash + fBusiness_Object.hashCode(); 
    }/* if */

    if(fCache_Locale != null) {
      hash = HASH_PRIME * hash + fCache_Locale.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fDescription != null) {
      hash = HASH_PRIME * hash + fDescription.hashCode(); 
    }/* if */

    if(fEffective_End_Date != null) {
      hash = HASH_PRIME * hash + fEffective_End_Date.hashCode(); 
    }/* if */

    if(fEffective_Start_Date != null) {
      hash = HASH_PRIME * hash + fEffective_Start_Date.hashCode(); 
    }/* if */

    if(fError_Process_Name != null) {
      hash = HASH_PRIME * hash + fError_Process_Name.hashCode(); 
    }/* if */

    if(fGroup != null) {
      hash = HASH_PRIME * hash + fGroup.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fModule != null) {
      hash = HASH_PRIME * hash + fModule.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fPersistent_Frequency != null) {
      hash = HASH_PRIME * hash + fPersistent_Frequency.hashCode(); 
    }/* if */

    if(fPersistent_Level != null) {
      hash = HASH_PRIME * hash + fPersistent_Level.hashCode(); 
    }/* if */

    if(fProcess_Name != null) {
      hash = HASH_PRIME * hash + fProcess_Name.hashCode(); 
    }/* if */

    if(fProject_Name != null) {
      hash = HASH_PRIME * hash + fProject_Name.hashCode(); 
    }/* if */

    if(fReplication_Level != null) {
      hash = HASH_PRIME * hash + fReplication_Level.hashCode(); 
    }/* if */

    if(fRunnable != null) {
      hash = HASH_PRIME * hash + fRunnable.hashCode(); 
    }/* if */

    if(fStatus != null) {
      hash = HASH_PRIME * hash + fStatus.hashCode(); 
    }/* if */

    if(fVersion != null) {
      hash = HASH_PRIME * hash + fVersion.hashCode(); 
    }/* if */

    if(fWorkflow_Mode != null) {
      hash = HASH_PRIME * hash + fWorkflow_Mode.hashCode(); 
    }/* if */

    if(fRepository_WF_Branch_ConnectorIC != null) {
      for(int i = 0; i < fRepository_WF_Branch_ConnectorIC.size(); ++i) { 
        Repository_WF_Branch_ConnectorIC  tmp = (Repository_WF_Branch_ConnectorIC)fRepository_WF_Branch_ConnectorIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    if(fRepository_WF_Process_PropIC != null) {
      for(int i = 0; i < fRepository_WF_Process_PropIC.size(); ++i) { 
        Repository_WF_Process_PropIC  tmp = (Repository_WF_Process_PropIC)fRepository_WF_Process_PropIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    if(fRepository_WF_StepIC != null) {
      for(int i = 0; i < fRepository_WF_StepIC.size(); ++i) { 
        Repository_WF_StepIC  tmp = (Repository_WF_StepIC)fRepository_WF_StepIC.get(i); 

        hash = HASH_PRIME * hash + tmp.hashCode(); 
      }/* for */ 
    }/* if */ 

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_Workflow_ProcessIC o = (Repository_Workflow_ProcessIC)object;

    if(fBusiness_Object == null) { 
       if(o.fBusiness_Object != null) return false; 
    }else if(! fBusiness_Object.equals(o.fBusiness_Object)) return false; 

    if(fCache_Locale == null) { 
       if(o.fCache_Locale != null) return false; 
    }else if(! fCache_Locale.equals(o.fCache_Locale)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fDescription == null) { 
       if(o.fDescription != null) return false; 
    }else if(! fDescription.equals(o.fDescription)) return false; 

    if(fEffective_End_Date == null) { 
       if(o.fEffective_End_Date != null) return false; 
    }else if(! fEffective_End_Date.equals(o.fEffective_End_Date)) return false; 

    if(fEffective_Start_Date == null) { 
       if(o.fEffective_Start_Date != null) return false; 
    }else if(! fEffective_Start_Date.equals(o.fEffective_Start_Date)) return false; 

    if(fError_Process_Name == null) { 
       if(o.fError_Process_Name != null) return false; 
    }else if(! fError_Process_Name.equals(o.fError_Process_Name)) return false; 

    if(fGroup == null) { 
       if(o.fGroup != null) return false; 
    }else if(! fGroup.equals(o.fGroup)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fModule == null) { 
       if(o.fModule != null) return false; 
    }else if(! fModule.equals(o.fModule)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fPersistent_Frequency == null) { 
       if(o.fPersistent_Frequency != null) return false; 
    }else if(! fPersistent_Frequency.equals(o.fPersistent_Frequency)) return false; 

    if(fPersistent_Level == null) { 
       if(o.fPersistent_Level != null) return false; 
    }else if(! fPersistent_Level.equals(o.fPersistent_Level)) return false; 

    if(fProcess_Name == null) { 
       if(o.fProcess_Name != null) return false; 
    }else if(! fProcess_Name.equals(o.fProcess_Name)) return false; 

    if(fProject_Name == null) { 
       if(o.fProject_Name != null) return false; 
    }else if(! fProject_Name.equals(o.fProject_Name)) return false; 

    if(fReplication_Level == null) { 
       if(o.fReplication_Level != null) return false; 
    }else if(! fReplication_Level.equals(o.fReplication_Level)) return false; 

    if(fRunnable == null) { 
       if(o.fRunnable != null) return false; 
    }else if(! fRunnable.equals(o.fRunnable)) return false; 

    if(fStatus == null) { 
       if(o.fStatus != null) return false; 
    }else if(! fStatus.equals(o.fStatus)) return false; 

    if(fVersion == null) { 
       if(o.fVersion != null) return false; 
    }else if(! fVersion.equals(o.fVersion)) return false; 

    if(fWorkflow_Mode == null) { 
       if(o.fWorkflow_Mode != null) return false; 
    }else if(! fWorkflow_Mode.equals(o.fWorkflow_Mode)) return false; 

    if((fRepository_WF_Branch_ConnectorIC != null) && (o.fRepository_WF_Branch_ConnectorIC != null)) { 
      if(fRepository_WF_Branch_ConnectorIC.size() != o.fRepository_WF_Branch_ConnectorIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Branch_ConnectorIC.size(); ++i) { 
         if(! fRepository_WF_Branch_ConnectorIC.get(i).equals(o.fRepository_WF_Branch_ConnectorIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Branch_ConnectorIC != o.fRepository_WF_Branch_ConnectorIC) return false;
    }/* if */

    if((fRepository_WF_Process_PropIC != null) && (o.fRepository_WF_Process_PropIC != null)) { 
      if(fRepository_WF_Process_PropIC.size() != o.fRepository_WF_Process_PropIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_Process_PropIC.size(); ++i) { 
         if(! fRepository_WF_Process_PropIC.get(i).equals(o.fRepository_WF_Process_PropIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_Process_PropIC != o.fRepository_WF_Process_PropIC) return false;
    }/* if */

    if((fRepository_WF_StepIC != null) && (o.fRepository_WF_StepIC != null)) { 
      if(fRepository_WF_StepIC.size() != o.fRepository_WF_StepIC.size()) return false; 

      for(int i = 0; i < fRepository_WF_StepIC.size(); ++i) { 
         if(! fRepository_WF_StepIC.get(i).equals(o.fRepository_WF_StepIC.get(i)))   
           return false;  
      }/* for */  
    }else{
      if(fRepository_WF_StepIC != o.fRepository_WF_StepIC) return false;
    }/* if */

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_Workflow_ProcessIC result = (Repository_Workflow_ProcessIC) super.clone();

      if(fRepository_WF_Branch_ConnectorIC != null) {
        result.fRepository_WF_Branch_ConnectorIC = (Vector)fRepository_WF_Branch_ConnectorIC.clone(); 

        for(int i = 0; i < fRepository_WF_Branch_ConnectorIC.size(); ++i) {   
          Repository_WF_Branch_ConnectorIC   elem  = (Repository_WF_Branch_ConnectorIC)fRepository_WF_Branch_ConnectorIC.elementAt(i); 

          result.fRepository_WF_Branch_ConnectorIC.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      if(fRepository_WF_Process_PropIC != null) {
        result.fRepository_WF_Process_PropIC = (Vector)fRepository_WF_Process_PropIC.clone(); 

        for(int i = 0; i < fRepository_WF_Process_PropIC.size(); ++i) {   
          Repository_WF_Process_PropIC   elem  = (Repository_WF_Process_PropIC)fRepository_WF_Process_PropIC.elementAt(i); 

          result.fRepository_WF_Process_PropIC.setElementAt(elem, i); 
        }/* for */ 
      }/* if */ 

      if(fRepository_WF_StepIC != null) {
        result.fRepository_WF_StepIC = (Vector)fRepository_WF_StepIC.clone(); 

        for(int i = 0; i < fRepository_WF_StepIC.size(); ++i) {   
          Repository_WF_StepIC   elem  = (Repository_WF_StepIC)fRepository_WF_StepIC.elementAt(i); 

          result.fRepository_WF_StepIC.setElementAt(elem, i); 
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

    if(fBusiness_Object != null)   
      ps.setProperty("Business Object", fBusiness_Object); 

    if(fCache_Locale != null)   
      ps.setProperty("Cache Locale", fCache_Locale); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fDescription != null)   
      ps.setProperty("Description", fDescription); 

    if(fEffective_End_Date != null)   
      ps.setProperty("Effective End Date", fEffective_End_Date); 

    if(fEffective_Start_Date != null)   
      ps.setProperty("Effective Start Date", fEffective_Start_Date); 

    if(fError_Process_Name != null)   
      ps.setProperty("Error Process Name", fError_Process_Name); 

    if(fGroup != null)   
      ps.setProperty("Group", fGroup); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fModule != null)   
      ps.setProperty("Module", fModule); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fPersistent_Frequency != null)   
      ps.setProperty("Persistent Frequency", fPersistent_Frequency); 

    if(fPersistent_Level != null)   
      ps.setProperty("Persistent Level", fPersistent_Level); 

    if(fProcess_Name != null)   
      ps.setProperty("Process Name", fProcess_Name); 

    if(fProject_Name != null)   
      ps.setProperty("Project Name", fProject_Name); 

    if(fReplication_Level != null)   
      ps.setProperty("Replication Level", fReplication_Level); 

    if(fRunnable != null)   
      ps.setProperty("Runnable", fRunnable); 

    if(fStatus != null)   
      ps.setProperty("Status", fStatus); 

    if(fVersion != null)   
      ps.setProperty("Version", fVersion); 

    if(fWorkflow_Mode != null)   
      ps.setProperty("Workflow Mode", fWorkflow_Mode); 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Branch_ConnectorIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Branch_ConnectorIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Branch Connector");

        for(int i = 0; i < fRepository_WF_Branch_ConnectorIC.size(); ++i) { 
          Repository_WF_Branch_ConnectorIC temp = (Repository_WF_Branch_ConnectorIC)  fRepository_WF_Branch_ConnectorIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Branch_ConnectorIC != null) {
        for(int i = 0; i < fRepository_WF_Branch_ConnectorIC.size(); ++i) {   
          Repository_WF_Branch_ConnectorIC temp = (Repository_WF_Branch_ConnectorIC)  fRepository_WF_Branch_ConnectorIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_Process_PropIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_Process_PropIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Process Prop");

        for(int i = 0; i < fRepository_WF_Process_PropIC.size(); ++i) { 
          Repository_WF_Process_PropIC temp = (Repository_WF_Process_PropIC)  fRepository_WF_Process_PropIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_Process_PropIC != null) {
        for(int i = 0; i < fRepository_WF_Process_PropIC.size(); ++i) {   
          Repository_WF_Process_PropIC temp = (Repository_WF_Process_PropIC)  fRepository_WF_Process_PropIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    if(USING_LIST) { 
      /* 
       * if fRepository_WF_StepIC is null then 
       *      the Siebel Adapter will ignore it.
       * otherwise 
       *      it will attempt to sync it.
       */
      if(fRepository_WF_StepIC != null) {
        SiebelPropertySet childPs = new SiebelPropertySet(); 

        childPs.setType("ListOfRepository WF Step");

        for(int i = 0; i < fRepository_WF_StepIC.size(); ++i) { 
          Repository_WF_StepIC temp = (Repository_WF_StepIC)  fRepository_WF_StepIC.get(i);  

          childPs.addChild(temp.toPropertySet());
        }/* for */ 
        ps.addChild(childPs); 
      }/* if */
    }else{       /* not using list */ 
      if(fRepository_WF_StepIC != null) {
        for(int i = 0; i < fRepository_WF_StepIC.size(); ++i) {   
          Repository_WF_StepIC temp = (Repository_WF_StepIC)  fRepository_WF_StepIC.get(i); 

          ps.addChild(temp.toPropertySet()); 
        }/* for */ 
      }/* if */
    }/* if USING_LIST */ 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fBusiness_Object = ps.getProperty("Business Object");
      fCache_Locale = ps.getProperty("Cache Locale");
      fComments = ps.getProperty("Comments");
      fDescription = ps.getProperty("Description");
      fEffective_End_Date = ps.getProperty("Effective End Date");
      fEffective_Start_Date = ps.getProperty("Effective Start Date");
      fError_Process_Name = ps.getProperty("Error Process Name");
      fGroup = ps.getProperty("Group");
      fInactive = ps.getProperty("Inactive");
      fModule = ps.getProperty("Module");
      fName = ps.getProperty("Name");
      fPersistent_Frequency = ps.getProperty("Persistent Frequency");
      fPersistent_Level = ps.getProperty("Persistent Level");
      fProcess_Name = ps.getProperty("Process Name");
      fProject_Name = ps.getProperty("Project Name");
      fReplication_Level = ps.getProperty("Replication Level");
      fRunnable = ps.getProperty("Runnable");
      fStatus = ps.getProperty("Status");
      fVersion = ps.getProperty("Version");
      fWorkflow_Mode = ps.getProperty("Workflow Mode");
      fRepository_WF_Branch_ConnectorIC = null;
      fRepository_WF_Process_PropIC = null;
      fRepository_WF_StepIC = null;

      for(int i = 0; i < ps.getChildCount(); ++i) {
        SiebelPropertySet  childPs = ps.getChild(i);

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Branch Connector")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Branch_ConnectorIC tmp = new Repository_WF_Branch_ConnectorIC(childPs.getChild(j)); 

              addfRepository_WF_Branch_ConnectorIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Branch Connector")) { 
              Repository_WF_Branch_ConnectorIC tmp = new Repository_WF_Branch_ConnectorIC(childPs);    

              addfRepository_WF_Branch_ConnectorIC(tmp);
          }/* if */ 
        }/* if */  

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Process Prop")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_Process_PropIC tmp = new Repository_WF_Process_PropIC(childPs.getChild(j)); 

              addfRepository_WF_Process_PropIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Process Prop")) { 
              Repository_WF_Process_PropIC tmp = new Repository_WF_Process_PropIC(childPs);    

              addfRepository_WF_Process_PropIC(tmp);
          }/* if */ 
        }/* if */  

        if(USING_LIST) {  
          if(childPs.getType().equals("ListOfRepository WF Step")) { 
            for(int j = 0; j < childPs.getChildCount(); ++j){   
              Repository_WF_StepIC tmp = new Repository_WF_StepIC(childPs.getChild(j)); 

              addfRepository_WF_StepIC(tmp);
            }/* for */ 
          }/* if */  
        }else{   /* not using list */ 
          if(childPs.getType().equals("Repository WF Step")) { 
              Repository_WF_StepIC tmp = new Repository_WF_StepIC(childPs);    

              addfRepository_WF_StepIC(tmp);
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


  /* access methods for fBusiness_Object */
  public     String getfBusiness_Object() { 
    return fBusiness_Object; 
  }/* public     String getfBusiness_Object(...) */ 

  public     void setfBusiness_Object(String val) { 
    fBusiness_Object = val; 
  }/* public     void setfBusiness_Object(...) */  


  /* access methods for fCache_Locale */
  public     String getfCache_Locale() { 
    return fCache_Locale; 
  }/* public     String getfCache_Locale(...) */ 

  public     void setfCache_Locale(String val) { 
    fCache_Locale = val; 
  }/* public     void setfCache_Locale(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fDescription */
  public     String getfDescription() { 
    return fDescription; 
  }/* public     String getfDescription(...) */ 

  public     void setfDescription(String val) { 
    fDescription = val; 
  }/* public     void setfDescription(...) */  


  /* access methods for fEffective_End_Date */
  public     String getfEffective_End_Date() { 
    return fEffective_End_Date; 
  }/* public     String getfEffective_End_Date(...) */ 

  public     void setfEffective_End_Date(String val) { 
    fEffective_End_Date = val; 
  }/* public     void setfEffective_End_Date(...) */  


  /* access methods for fEffective_Start_Date */
  public     String getfEffective_Start_Date() { 
    return fEffective_Start_Date; 
  }/* public     String getfEffective_Start_Date(...) */ 

  public     void setfEffective_Start_Date(String val) { 
    fEffective_Start_Date = val; 
  }/* public     void setfEffective_Start_Date(...) */  


  /* access methods for fError_Process_Name */
  public     String getfError_Process_Name() { 
    return fError_Process_Name; 
  }/* public     String getfError_Process_Name(...) */ 

  public     void setfError_Process_Name(String val) { 
    fError_Process_Name = val; 
  }/* public     void setfError_Process_Name(...) */  


  /* access methods for fGroup */
  public     String getfGroup() { 
    return fGroup; 
  }/* public     String getfGroup(...) */ 

  public     void setfGroup(String val) { 
    fGroup = val; 
  }/* public     void setfGroup(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fModule */
  public     String getfModule() { 
    return fModule; 
  }/* public     String getfModule(...) */ 

  public     void setfModule(String val) { 
    fModule = val; 
  }/* public     void setfModule(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fPersistent_Frequency */
  public     String getfPersistent_Frequency() { 
    return fPersistent_Frequency; 
  }/* public     String getfPersistent_Frequency(...) */ 

  public     void setfPersistent_Frequency(String val) { 
    fPersistent_Frequency = val; 
  }/* public     void setfPersistent_Frequency(...) */  


  /* access methods for fPersistent_Level */
  public     String getfPersistent_Level() { 
    return fPersistent_Level; 
  }/* public     String getfPersistent_Level(...) */ 

  public     void setfPersistent_Level(String val) { 
    fPersistent_Level = val; 
  }/* public     void setfPersistent_Level(...) */  


  /* access methods for fProcess_Name */
  public     String getfProcess_Name() { 
    return fProcess_Name; 
  }/* public     String getfProcess_Name(...) */ 

  public     void setfProcess_Name(String val) { 
    fProcess_Name = val; 
  }/* public     void setfProcess_Name(...) */  


  /* access methods for fProject_Name */
  public     String getfProject_Name() { 
    return fProject_Name; 
  }/* public     String getfProject_Name(...) */ 

  public     void setfProject_Name(String val) { 
    fProject_Name = val; 
  }/* public     void setfProject_Name(...) */  


  /* access methods for fReplication_Level */
  public     String getfReplication_Level() { 
    return fReplication_Level; 
  }/* public     String getfReplication_Level(...) */ 

  public     void setfReplication_Level(String val) { 
    fReplication_Level = val; 
  }/* public     void setfReplication_Level(...) */  


  /* access methods for fRunnable */
  public     String getfRunnable() { 
    return fRunnable; 
  }/* public     String getfRunnable(...) */ 

  public     void setfRunnable(String val) { 
    fRunnable = val; 
  }/* public     void setfRunnable(...) */  


  /* access methods for fStatus */
  public     String getfStatus() { 
    return fStatus; 
  }/* public     String getfStatus(...) */ 

  public     void setfStatus(String val) { 
    fStatus = val; 
  }/* public     void setfStatus(...) */  


  /* access methods for fVersion */
  public     String getfVersion() { 
    return fVersion; 
  }/* public     String getfVersion(...) */ 

  public     void setfVersion(String val) { 
    fVersion = val; 
  }/* public     void setfVersion(...) */  


  /* access methods for fWorkflow_Mode */
  public     String getfWorkflow_Mode() { 
    return fWorkflow_Mode; 
  }/* public     String getfWorkflow_Mode(...) */ 

  public     void setfWorkflow_Mode(String val) { 
    fWorkflow_Mode = val; 
  }/* public     void setfWorkflow_Mode(...) */  


  /* access methods for fRepository_WF_Branch_ConnectorIC */
  public     Vector getfRepository_WF_Branch_ConnectorIC() {     
    if(fRepository_WF_Branch_ConnectorIC != null) {
      return (Vector)fRepository_WF_Branch_ConnectorIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Branch_ConnectorIC(...) */ 

  public     void addfRepository_WF_Branch_ConnectorIC(Repository_WF_Branch_ConnectorIC val) { 
    if(val != null) {
      if(fRepository_WF_Branch_ConnectorIC == null) { 
        fRepository_WF_Branch_ConnectorIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Branch_ConnectorIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Branch_ConnectorIC(...) */ 

  public     void clearfRepository_WF_Branch_ConnectorIC() { 
    if(fRepository_WF_Branch_ConnectorIC != null) { 
      fRepository_WF_Branch_ConnectorIC.removeAllElements(); 
      fRepository_WF_Branch_ConnectorIC = null;
    }/* if */ 

    fRepository_WF_Branch_ConnectorIC = new Vector();
  }/* public     void clearfRepository_WF_Branch_ConnectorIC(...) */ 

  public     void removefRepository_WF_Branch_ConnectorIC() { 
    if(fRepository_WF_Branch_ConnectorIC != null) { 
      fRepository_WF_Branch_ConnectorIC.removeAllElements(); 
      fRepository_WF_Branch_ConnectorIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Branch_ConnectorIC(...) */ 


  /* access methods for fRepository_WF_Process_PropIC */
  public     Vector getfRepository_WF_Process_PropIC() {     
    if(fRepository_WF_Process_PropIC != null) {
      return (Vector)fRepository_WF_Process_PropIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_Process_PropIC(...) */ 

  public     void addfRepository_WF_Process_PropIC(Repository_WF_Process_PropIC val) { 
    if(val != null) {
      if(fRepository_WF_Process_PropIC == null) { 
        fRepository_WF_Process_PropIC = new Vector(); 
      }/* if */ 

      fRepository_WF_Process_PropIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_Process_PropIC(...) */ 

  public     void clearfRepository_WF_Process_PropIC() { 
    if(fRepository_WF_Process_PropIC != null) { 
      fRepository_WF_Process_PropIC.removeAllElements(); 
      fRepository_WF_Process_PropIC = null;
    }/* if */ 

    fRepository_WF_Process_PropIC = new Vector();
  }/* public     void clearfRepository_WF_Process_PropIC(...) */ 

  public     void removefRepository_WF_Process_PropIC() { 
    if(fRepository_WF_Process_PropIC != null) { 
      fRepository_WF_Process_PropIC.removeAllElements(); 
      fRepository_WF_Process_PropIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_Process_PropIC(...) */ 


  /* access methods for fRepository_WF_StepIC */
  public     Vector getfRepository_WF_StepIC() {     
    if(fRepository_WF_StepIC != null) {
      return (Vector)fRepository_WF_StepIC.clone();   
    }else{
      return null; 
    }/* if-else */
  }/* public     Vector getfRepository_WF_StepIC(...) */ 

  public     void addfRepository_WF_StepIC(Repository_WF_StepIC val) { 
    if(val != null) {
      if(fRepository_WF_StepIC == null) { 
        fRepository_WF_StepIC = new Vector(); 
      }/* if */ 

      fRepository_WF_StepIC.add(val); 
    }/* if */ 
  }/* public     void addfRepository_WF_StepIC(...) */ 

  public     void clearfRepository_WF_StepIC() { 
    if(fRepository_WF_StepIC != null) { 
      fRepository_WF_StepIC.removeAllElements(); 
      fRepository_WF_StepIC = null;
    }/* if */ 

    fRepository_WF_StepIC = new Vector();
  }/* public     void clearfRepository_WF_StepIC(...) */ 

  public     void removefRepository_WF_StepIC() { 
    if(fRepository_WF_StepIC != null) { 
      fRepository_WF_StepIC.removeAllElements(); 
      fRepository_WF_StepIC = null;
    }/* if */ 
  }/* public     void removefRepository_WF_StepIC(...) */ 




  /* member variables */
  protected String  fBusiness_Object = null;
  protected String  fCache_Locale = null;
  protected String  fComments = null;
  protected String  fDescription = null;
  protected String  fEffective_End_Date = null;
  protected String  fEffective_Start_Date = null;
  protected String  fError_Process_Name = null;
  protected String  fGroup = null;
  protected String  fInactive = null;
  protected String  fModule = null;
  protected String  fName = null;
  protected String  fPersistent_Frequency = null;
  protected String  fPersistent_Level = null;
  protected String  fProcess_Name = null;
  protected String  fProject_Name = null;
  protected String  fReplication_Level = null;
  protected String  fRunnable = null;
  protected String  fStatus = null;
  protected String  fVersion = null;
  protected String  fWorkflow_Mode = null;
  protected Vector  fRepository_WF_Branch_ConnectorIC = null;
  protected Vector  fRepository_WF_Process_PropIC = null;
  protected Vector  fRepository_WF_StepIC = null;
}/* Repository_Workflow_ProcessIC */






