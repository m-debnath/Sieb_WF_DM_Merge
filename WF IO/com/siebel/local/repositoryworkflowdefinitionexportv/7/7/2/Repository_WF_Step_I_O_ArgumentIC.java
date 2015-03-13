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

public    class Repository_WF_Step_I_O_ArgumentIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Step I/O Argument";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FBUSINESS_COMPONENT_PROPERTY  =  "Business Component";
  protected static final String  FBUSINESS_COMPONENT_FIELD_PROPERTY  =  "Business Component Field";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FINPUT_FLAG_PROPERTY  =  "Input Flag";
  protected static final String  FITEM_TYPE_NAME_PROPERTY  =  "Item Type Name";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FOUTPUT_ARG_PROPERTY  =  "Output Arg";
  protected static final String  FPROPERTY_NAME_PROPERTY  =  "Property Name";
  protected static final String  FSEQUENCE_PROPERTY  =  "Sequence";
  protected static final String  FTYPE_PROPERTY  =  "Type";
  protected static final String  FVALUE_SEARCH_SPECIFICATION_PROPERTY  =  "Value/Search Specification";

  /* default constructor */ 
  public Repository_WF_Step_I_O_ArgumentIC()  { 
    super(); 
  }/* public Repository_WF_Step_I_O_ArgumentIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Step_I_O_ArgumentIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Step_I_O_ArgumentIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fBusiness_Component != null) {
      hash = HASH_PRIME * hash + fBusiness_Component.hashCode(); 
    }/* if */

    if(fBusiness_Component_Field != null) {
      hash = HASH_PRIME * hash + fBusiness_Component_Field.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
    }/* if */

    if(fInactive != null) {
      hash = HASH_PRIME * hash + fInactive.hashCode(); 
    }/* if */

    if(fInput_Flag != null) {
      hash = HASH_PRIME * hash + fInput_Flag.hashCode(); 
    }/* if */

    if(fItem_Type_Name != null) {
      hash = HASH_PRIME * hash + fItem_Type_Name.hashCode(); 
    }/* if */

    if(fName != null) {
      hash = HASH_PRIME * hash + fName.hashCode(); 
    }/* if */

    if(fOutput_Arg != null) {
      hash = HASH_PRIME * hash + fOutput_Arg.hashCode(); 
    }/* if */

    if(fProperty_Name != null) {
      hash = HASH_PRIME * hash + fProperty_Name.hashCode(); 
    }/* if */

    if(fSequence != null) {
      hash = HASH_PRIME * hash + fSequence.hashCode(); 
    }/* if */

    if(fType != null) {
      hash = HASH_PRIME * hash + fType.hashCode(); 
    }/* if */

    if(fValue_Search_Specification != null) {
      hash = HASH_PRIME * hash + fValue_Search_Specification.hashCode(); 
    }/* if */

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Step_I_O_ArgumentIC o = (Repository_WF_Step_I_O_ArgumentIC)object;

    if(fBusiness_Component == null) { 
       if(o.fBusiness_Component != null) return false; 
    }else if(! fBusiness_Component.equals(o.fBusiness_Component)) return false; 

    if(fBusiness_Component_Field == null) { 
       if(o.fBusiness_Component_Field != null) return false; 
    }else if(! fBusiness_Component_Field.equals(o.fBusiness_Component_Field)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fInput_Flag == null) { 
       if(o.fInput_Flag != null) return false; 
    }else if(! fInput_Flag.equals(o.fInput_Flag)) return false; 

    if(fItem_Type_Name == null) { 
       if(o.fItem_Type_Name != null) return false; 
    }else if(! fItem_Type_Name.equals(o.fItem_Type_Name)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fOutput_Arg == null) { 
       if(o.fOutput_Arg != null) return false; 
    }else if(! fOutput_Arg.equals(o.fOutput_Arg)) return false; 

    if(fProperty_Name == null) { 
       if(o.fProperty_Name != null) return false; 
    }else if(! fProperty_Name.equals(o.fProperty_Name)) return false; 

    if(fSequence == null) { 
       if(o.fSequence != null) return false; 
    }else if(! fSequence.equals(o.fSequence)) return false; 

    if(fType == null) { 
       if(o.fType != null) return false; 
    }else if(! fType.equals(o.fType)) return false; 

    if(fValue_Search_Specification == null) { 
       if(o.fValue_Search_Specification != null) return false; 
    }else if(! fValue_Search_Specification.equals(o.fValue_Search_Specification)) return false; 

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Step_I_O_ArgumentIC result = (Repository_WF_Step_I_O_ArgumentIC) super.clone();

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fBusiness_Component != null)   
      ps.setProperty("Business Component", fBusiness_Component); 

    if(fBusiness_Component_Field != null)   
      ps.setProperty("Business Component Field", fBusiness_Component_Field); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fInput_Flag != null)   
      ps.setProperty("Input Flag", fInput_Flag); 

    if(fItem_Type_Name != null)   
      ps.setProperty("Item Type Name", fItem_Type_Name); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fOutput_Arg != null)   
      ps.setProperty("Output Arg", fOutput_Arg); 

    if(fProperty_Name != null)   
      ps.setProperty("Property Name", fProperty_Name); 

    if(fSequence != null)   
      ps.setProperty("Sequence", fSequence); 

    if(fType != null)   
      ps.setProperty("Type", fType); 

    if(fValue_Search_Specification != null)   
      ps.setProperty("Value/Search Specification", fValue_Search_Specification); 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fBusiness_Component = ps.getProperty("Business Component");
      fBusiness_Component_Field = ps.getProperty("Business Component Field");
      fComments = ps.getProperty("Comments");
      fInactive = ps.getProperty("Inactive");
      fInput_Flag = ps.getProperty("Input Flag");
      fItem_Type_Name = ps.getProperty("Item Type Name");
      fName = ps.getProperty("Name");
      fOutput_Arg = ps.getProperty("Output Arg");
      fProperty_Name = ps.getProperty("Property Name");
      fSequence = ps.getProperty("Sequence");
      fType = ps.getProperty("Type");
      fValue_Search_Specification = ps.getProperty("Value/Search Specification");

    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fBusiness_Component */
  public     String getfBusiness_Component() { 
    return fBusiness_Component; 
  }/* public     String getfBusiness_Component(...) */ 

  public     void setfBusiness_Component(String val) { 
    fBusiness_Component = val; 
  }/* public     void setfBusiness_Component(...) */  


  /* access methods for fBusiness_Component_Field */
  public     String getfBusiness_Component_Field() { 
    return fBusiness_Component_Field; 
  }/* public     String getfBusiness_Component_Field(...) */ 

  public     void setfBusiness_Component_Field(String val) { 
    fBusiness_Component_Field = val; 
  }/* public     void setfBusiness_Component_Field(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


  /* access methods for fInactive */
  public     String getfInactive() { 
    return fInactive; 
  }/* public     String getfInactive(...) */ 

  public     void setfInactive(String val) { 
    fInactive = val; 
  }/* public     void setfInactive(...) */  


  /* access methods for fInput_Flag */
  public     String getfInput_Flag() { 
    return fInput_Flag; 
  }/* public     String getfInput_Flag(...) */ 

  public     void setfInput_Flag(String val) { 
    fInput_Flag = val; 
  }/* public     void setfInput_Flag(...) */  


  /* access methods for fItem_Type_Name */
  public     String getfItem_Type_Name() { 
    return fItem_Type_Name; 
  }/* public     String getfItem_Type_Name(...) */ 

  public     void setfItem_Type_Name(String val) { 
    fItem_Type_Name = val; 
  }/* public     void setfItem_Type_Name(...) */  


  /* access methods for fName */
  public     String getfName() { 
    return fName; 
  }/* public     String getfName(...) */ 

  public     void setfName(String val) { 
    fName = val; 
  }/* public     void setfName(...) */  


  /* access methods for fOutput_Arg */
  public     String getfOutput_Arg() { 
    return fOutput_Arg; 
  }/* public     String getfOutput_Arg(...) */ 

  public     void setfOutput_Arg(String val) { 
    fOutput_Arg = val; 
  }/* public     void setfOutput_Arg(...) */  


  /* access methods for fProperty_Name */
  public     String getfProperty_Name() { 
    return fProperty_Name; 
  }/* public     String getfProperty_Name(...) */ 

  public     void setfProperty_Name(String val) { 
    fProperty_Name = val; 
  }/* public     void setfProperty_Name(...) */  


  /* access methods for fSequence */
  public     String getfSequence() { 
    return fSequence; 
  }/* public     String getfSequence(...) */ 

  public     void setfSequence(String val) { 
    fSequence = val; 
  }/* public     void setfSequence(...) */  


  /* access methods for fType */
  public     String getfType() { 
    return fType; 
  }/* public     String getfType(...) */ 

  public     void setfType(String val) { 
    fType = val; 
  }/* public     void setfType(...) */  


  /* access methods for fValue_Search_Specification */
  public     String getfValue_Search_Specification() { 
    return fValue_Search_Specification; 
  }/* public     String getfValue_Search_Specification(...) */ 

  public     void setfValue_Search_Specification(String val) { 
    fValue_Search_Specification = val; 
  }/* public     void setfValue_Search_Specification(...) */  




  /* member variables */
  protected String  fBusiness_Component = null;
  protected String  fBusiness_Component_Field = null;
  protected String  fComments = null;
  protected String  fInactive = null;
  protected String  fInput_Flag = null;
  protected String  fItem_Type_Name = null;
  protected String  fName = null;
  protected String  fOutput_Arg = null;
  protected String  fProperty_Name = null;
  protected String  fSequence = null;
  protected String  fType = null;
  protected String  fValue_Search_Specification = null;
}/* Repository_WF_Step_I_O_ArgumentIC */






