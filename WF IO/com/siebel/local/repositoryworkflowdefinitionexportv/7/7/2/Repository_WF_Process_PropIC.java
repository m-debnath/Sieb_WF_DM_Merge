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

public    class Repository_WF_Process_PropIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Process Prop";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FACCESS_MODE_PROPERTY  =  "Access Mode";
  protected static final String  FBUSINESS_COMPONENT_PROPERTY  =  "Business Component";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FCORRELATOR_FLAG_PROPERTY  =  "Correlator Flag";
  protected static final String  FDATA_TYPE_PROPERTY  =  "Data Type";
  protected static final String  FDEFAULT_DATE_PROPERTY  =  "Default Date";
  protected static final String  FDEFAULT_NUMBER_PROPERTY  =  "Default Number";
  protected static final String  FDEFAULT_STRING_PROPERTY  =  "Default String";
  protected static final String  FDISPLAY_NAME_PROPERTY  =  "Display Name";
  protected static final String  FINOUT_PROPERTY  =  "InOut";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FINTEGRATION_OBJECT_PROPERTY  =  "Integration Object";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FVIRTUAL_FIELD_PROPERTY  =  "Virtual Field";

  /* default constructor */ 
  public Repository_WF_Process_PropIC()  { 
    super(); 
  }/* public Repository_WF_Process_PropIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Process_PropIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Process_PropIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fAccess_Mode != null) {
      hash = HASH_PRIME * hash + fAccess_Mode.hashCode(); 
    }/* if */

    if(fBusiness_Component != null) {
      hash = HASH_PRIME * hash + fBusiness_Component.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fCorrelator_Flag != null) {
      hash = HASH_PRIME * hash + fCorrelator_Flag.hashCode(); 
    }/* if */

    if(fData_Type != null) {
      hash = HASH_PRIME * hash + fData_Type.hashCode(); 
    }/* if */

    if(fDefault_Date != null) {
      hash = HASH_PRIME * hash + fDefault_Date.hashCode(); 
    }/* if */

    if(fDefault_Number != null) {
      hash = HASH_PRIME * hash + fDefault_Number.hashCode(); 
    }/* if */

    if(fDefault_String != null) {
      hash = HASH_PRIME * hash + fDefault_String.hashCode(); 
    }/* if */

    if(fDisplay_Name != null) {
      hash = HASH_PRIME * hash + fDisplay_Name.hashCode(); 
    }/* if */

    if(fInOut != null) {
      hash = HASH_PRIME * hash + fInOut.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fIntegration_Object != null) {
      hash = HASH_PRIME * hash + fIntegration_Object.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fVirtual_Field != null) {
      hash = HASH_PRIME * hash + fVirtual_Field.hashCode(); 
    }/* if */

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Process_PropIC o = (Repository_WF_Process_PropIC)object;

    if(fAccess_Mode == null) { 
       if(o.fAccess_Mode != null) return false; 
    }else if(! fAccess_Mode.equals(o.fAccess_Mode)) return false; 

    if(fBusiness_Component == null) { 
       if(o.fBusiness_Component != null) return false; 
    }else if(! fBusiness_Component.equals(o.fBusiness_Component)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fCorrelator_Flag == null) { 
       if(o.fCorrelator_Flag != null) return false; 
    }else if(! fCorrelator_Flag.equals(o.fCorrelator_Flag)) return false; 

    if(fData_Type == null) { 
       if(o.fData_Type != null) return false; 
    }else if(! fData_Type.equals(o.fData_Type)) return false; 

    if(fDefault_Date == null) { 
       if(o.fDefault_Date != null) return false; 
    }else if(! fDefault_Date.equals(o.fDefault_Date)) return false; 

    if(fDefault_Number == null) { 
       if(o.fDefault_Number != null) return false; 
    }else if(! fDefault_Number.equals(o.fDefault_Number)) return false; 

    if(fDefault_String == null) { 
       if(o.fDefault_String != null) return false; 
    }else if(! fDefault_String.equals(o.fDefault_String)) return false; 

    if(fDisplay_Name == null) { 
       if(o.fDisplay_Name != null) return false; 
    }else if(! fDisplay_Name.equals(o.fDisplay_Name)) return false; 

    if(fInOut == null) { 
       if(o.fInOut != null) return false; 
    }else if(! fInOut.equals(o.fInOut)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fIntegration_Object == null) { 
       if(o.fIntegration_Object != null) return false; 
    }else if(! fIntegration_Object.equals(o.fIntegration_Object)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fVirtual_Field == null) { 
       if(o.fVirtual_Field != null) return false; 
    }else if(! fVirtual_Field.equals(o.fVirtual_Field)) return false; 

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Process_PropIC result = (Repository_WF_Process_PropIC) super.clone();

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fAccess_Mode != null)   
      ps.setProperty("Access Mode", fAccess_Mode); 

    if(fBusiness_Component != null)   
      ps.setProperty("Business Component", fBusiness_Component); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fCorrelator_Flag != null)   
      ps.setProperty("Correlator Flag", fCorrelator_Flag); 

    if(fData_Type != null)   
      ps.setProperty("Data Type", fData_Type); 

    if(fDefault_Date != null)   
      ps.setProperty("Default Date", fDefault_Date); 

    if(fDefault_Number != null)   
      ps.setProperty("Default Number", fDefault_Number); 

    if(fDefault_String != null)   
      ps.setProperty("Default String", fDefault_String); 

    if(fDisplay_Name != null)   
      ps.setProperty("Display Name", fDisplay_Name); 

    if(fInOut != null)   
      ps.setProperty("InOut", fInOut); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fIntegration_Object != null)   
      ps.setProperty("Integration Object", fIntegration_Object); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fVirtual_Field != null)   
      ps.setProperty("Virtual Field", fVirtual_Field); 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fAccess_Mode = ps.getProperty("Access Mode");
      fBusiness_Component = ps.getProperty("Business Component");
      fComments = ps.getProperty("Comments");
      fCorrelator_Flag = ps.getProperty("Correlator Flag");
      fData_Type = ps.getProperty("Data Type");
      fDefault_Date = ps.getProperty("Default Date");
      fDefault_Number = ps.getProperty("Default Number");
      fDefault_String = ps.getProperty("Default String");
      fDisplay_Name = ps.getProperty("Display Name");
      fInOut = ps.getProperty("InOut");
      fInactive = ps.getProperty("Inactive");
      fIntegration_Object = ps.getProperty("Integration Object");
      fName = ps.getProperty("Name");
      fVirtual_Field = ps.getProperty("Virtual Field");

    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fAccess_Mode */
  public     String getfAccess_Mode() { 
    return fAccess_Mode; 
  }/* public     String getfAccess_Mode(...) */ 

  public     void setfAccess_Mode(String val) { 
    fAccess_Mode = val; 
  }/* public     void setfAccess_Mode(...) */  


  /* access methods for fBusiness_Component */
  public     String getfBusiness_Component() { 
    return fBusiness_Component; 
  }/* public     String getfBusiness_Component(...) */ 

  public     void setfBusiness_Component(String val) { 
    fBusiness_Component = val; 
  }/* public     void setfBusiness_Component(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fCorrelator_Flag */
  public     String getfCorrelator_Flag() { 
    return fCorrelator_Flag; 
  }/* public     String getfCorrelator_Flag(...) */ 

  public     void setfCorrelator_Flag(String val) { 
    fCorrelator_Flag = val; 
  }/* public     void setfCorrelator_Flag(...) */  


  /* access methods for fData_Type */
  public     String getfData_Type() { 
    return fData_Type; 
  }/* public     String getfData_Type(...) */ 

  public     void setfData_Type(String val) { 
    fData_Type = val; 
  }/* public     void setfData_Type(...) */  


  /* access methods for fDefault_Date */
  public     String getfDefault_Date() { 
    return fDefault_Date; 
  }/* public     String getfDefault_Date(...) */ 

  public     void setfDefault_Date(String val) { 
    fDefault_Date = val; 
  }/* public     void setfDefault_Date(...) */  


  /* access methods for fDefault_Number */
  public     String getfDefault_Number() { 
    return fDefault_Number; 
  }/* public     String getfDefault_Number(...) */ 

  public     void setfDefault_Number(String val) { 
    fDefault_Number = val; 
  }/* public     void setfDefault_Number(...) */  


  /* access methods for fDefault_String */
  public     String getfDefault_String() { 
    return fDefault_String; 
  }/* public     String getfDefault_String(...) */ 

  public     void setfDefault_String(String val) { 
    fDefault_String = val; 
  }/* public     void setfDefault_String(...) */  


  /* access methods for fDisplay_Name */
  public     String getfDisplay_Name() { 
    return fDisplay_Name; 
  }/* public     String getfDisplay_Name(...) */ 

  public     void setfDisplay_Name(String val) { 
    fDisplay_Name = val; 
  }/* public     void setfDisplay_Name(...) */  


  /* access methods for fInOut */
  public     String getfInOut() { 
    return fInOut; 
  }/* public     String getfInOut(...) */ 

  public     void setfInOut(String val) { 
    fInOut = val; 
  }/* public     void setfInOut(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fIntegration_Object */
  public     String getfIntegration_Object() { 
    return fIntegration_Object; 
  }/* public     String getfIntegration_Object(...) */ 

  public     void setfIntegration_Object(String val) { 
    fIntegration_Object = val; 
  }/* public     void setfIntegration_Object(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fVirtual_Field */
  public     String getfVirtual_Field() { 
    return fVirtual_Field; 
  }/* public     String getfVirtual_Field(...) */ 

  public     void setfVirtual_Field(String val) { 
    fVirtual_Field = val; 
  }/* public     void setfVirtual_Field(...) */  




  /* member variables */
  protected String  fAccess_Mode = null;
  protected String  fBusiness_Component = null;
  protected String  fComments = null;
  protected String  fCorrelator_Flag = null;
  protected String  fData_Type = null;
  protected String  fDefault_Date = null;
  protected String  fDefault_Number = null;
  protected String  fDefault_String = null;
  protected String  fDisplay_Name = null;
  protected String  fInOut = null;
  protected String  fInactive = null;
  protected String  fIntegration_Object = null;
  protected String  fName = null;
  protected String  fVirtual_Field = null;
}/* Repository_WF_Process_PropIC */






