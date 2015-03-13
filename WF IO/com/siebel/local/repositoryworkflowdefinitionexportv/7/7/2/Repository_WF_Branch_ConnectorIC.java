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

public    class Repository_WF_Branch_ConnectorIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Branch Connector";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FFROM_STEP_NAME_PROPERTY  =  "From Step Name";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FLAYOUT_PROPERTY  =  "Layout";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FPARENT_NAME_PROPERTY  =  "Parent Name";
  protected static final String  FPARENT_TYPE_PROPERTY  =  "Parent Type";
  protected static final String  FTO_STEP_NAME_PROPERTY  =  "To Step Name";

  /* default constructor */ 
  public Repository_WF_Branch_ConnectorIC()  { 
    super(); 
  }/* public Repository_WF_Branch_ConnectorIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Branch_ConnectorIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Branch_ConnectorIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fFrom_Step_Name != null) {
      hash = HASH_PRIME * hash + fFrom_Step_Name.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fLayout != null) {
      hash = HASH_PRIME * hash + fLayout.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fParent_Name != null) {
      hash = HASH_PRIME * hash + fParent_Name.hashCode(); 
    }/* if */

    if(fParent_Type != null) {
      hash = HASH_PRIME * hash + fParent_Type.hashCode(); 
    }/* if */

    if(fTo_Step_Name != null) {
      hash = HASH_PRIME * hash + fTo_Step_Name.hashCode(); 
    }/* if */

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Branch_ConnectorIC o = (Repository_WF_Branch_ConnectorIC)object;

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fFrom_Step_Name == null) { 
       if(o.fFrom_Step_Name != null) return false; 
    }else if(! fFrom_Step_Name.equals(o.fFrom_Step_Name)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fLayout == null) { 
       if(o.fLayout != null) return false; 
    }else if(! fLayout.equals(o.fLayout)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fParent_Name == null) { 
       if(o.fParent_Name != null) return false; 
    }else if(! fParent_Name.equals(o.fParent_Name)) return false; 

    if(fParent_Type == null) { 
       if(o.fParent_Type != null) return false; 
    }else if(! fParent_Type.equals(o.fParent_Type)) return false; 

    if(fTo_Step_Name == null) { 
       if(o.fTo_Step_Name != null) return false; 
    }else if(! fTo_Step_Name.equals(o.fTo_Step_Name)) return false; 

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Branch_ConnectorIC result = (Repository_WF_Branch_ConnectorIC) super.clone();

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

    if(fFrom_Step_Name != null)   
      ps.setProperty("From Step Name", fFrom_Step_Name); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fLayout != null)   
      ps.setProperty("Layout", fLayout); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fParent_Name != null)   
      ps.setProperty("Parent Name", fParent_Name); 

    if(fParent_Type != null)   
      ps.setProperty("Parent Type", fParent_Type); 

    if(fTo_Step_Name != null)   
      ps.setProperty("To Step Name", fTo_Step_Name); 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fComments = ps.getProperty("Comments");
      fFrom_Step_Name = ps.getProperty("From Step Name");
      fInactive = ps.getProperty("Inactive");
      fLayout = ps.getProperty("Layout");
      fName = ps.getProperty("Name");
      fParent_Name = ps.getProperty("Parent Name");
      fParent_Type = ps.getProperty("Parent Type");
      fTo_Step_Name = ps.getProperty("To Step Name");

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


  /* access methods for fFrom_Step_Name */
  public     String getfFrom_Step_Name() { 
    return fFrom_Step_Name; 
  }/* public     String getfFrom_Step_Name(...) */ 

  public     void setfFrom_Step_Name(String val) { 
    fFrom_Step_Name = val; 
  }/* public     void setfFrom_Step_Name(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fLayout */
  public     String getfLayout() { 
    return fLayout; 
  }/* public     String getfLayout(...) */ 

  public     void setfLayout(String val) { 
    fLayout = val; 
  }/* public     void setfLayout(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fParent_Name */
  public     String getfParent_Name() { 
    return fParent_Name; 
  }/* public     String getfParent_Name(...) */ 

  public     void setfParent_Name(String val) { 
    fParent_Name = val; 
  }/* public     void setfParent_Name(...) */  


  /* access methods for fParent_Type */
  public     String getfParent_Type() { 
    return fParent_Type; 
  }/* public     String getfParent_Type(...) */ 

  public     void setfParent_Type(String val) { 
    fParent_Type = val; 
  }/* public     void setfParent_Type(...) */  


  /* access methods for fTo_Step_Name */
  public     String getfTo_Step_Name() { 
    return fTo_Step_Name; 
  }/* public     String getfTo_Step_Name(...) */ 

  public     void setfTo_Step_Name(String val) { 
    fTo_Step_Name = val; 
  }/* public     void setfTo_Step_Name(...) */  




  /* member variables */
  protected String  fComments = null;
  protected String  fFrom_Step_Name = null;
  protected String  fInactive = null;
  protected String  fLayout = null;
  protected String  fName = null;
  protected String  fParent_Name = null;
  protected String  fParent_Type = null;
  protected String  fTo_Step_Name = null;
}/* Repository_WF_Branch_ConnectorIC */






