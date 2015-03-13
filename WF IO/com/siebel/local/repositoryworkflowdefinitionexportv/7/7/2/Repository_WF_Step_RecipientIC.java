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

public    class Repository_WF_Step_RecipientIC implements  Serializable, Cloneable, SiebelHierarchy {
  /* class level properties */
  public    static final String  SIEBEL_REPOSITORY  = "Siebel Repository";
  public    static final String  SIEBEL_VERSION     = "";

  public    static final String  CLASS_PROPERTY     = "Repository WF Step Recipient";
  public    static final boolean USING_LIST         = true;
  public    static final boolean PS_TYPE_REQUIRED   = true;

  /* Field Level Properties */
  protected static final String  FBUSINESS_COMPONENT_FIELD_PROPERTY  =  "Business Component Field";
  protected static final String  FBUSINESS_COMPONENT_NAME_PROPERTY  =  "Business Component Name";
  protected static final String  FCOMMENTS_PROPERTY  =  "Comments";
  protected static final String  FEXPRESSION_PROPERTY  =  "Expression";
  protected static final String  FINACTIVE_PROPERTY  =  "Inactive";
  protected static final String  FNAME_PROPERTY  =  "Name";
  protected static final String  FPROCESS_PROPERTY_NAME_PROPERTY  =  "Process Property Name";
  protected static final String  FRECIPIENT_NAME_PROPERTY  =  "Recipient Name";
  protected static final String  FRECIPIENT_TYPE_CODE_PROPERTY  =  "Recipient Type Code";
  protected static final String  FVALUE_TYPE_CODE_PROPERTY  =  "Value Type Code";

  /* default constructor */ 
  public Repository_WF_Step_RecipientIC()  { 
    super(); 
  }/* public Repository_WF_Step_RecipientIC(...) */ 

 
  /* constructor from a Siebel Property Set */ 
  public Repository_WF_Step_RecipientIC(SiebelPropertySet ps) throws SiebelException { 
    super(); 
    fromPropertySet(ps);  
  }/* public Repository_WF_Step_RecipientIC(...) */     


  public int hashCode() {
    int HASH_PRIME = 51;
    int hash       =  0;

    if(fBusiness_Component_Field != null) {
      hash = HASH_PRIME * hash + fBusiness_Component_Field.hashCode(); 
    }/* if */

    if(fBusiness_Component_Name != null) {
      hash = HASH_PRIME * hash + fBusiness_Component_Name.hashCode(); 
    }/* if */

    if(fComments != null) {
      hash = HASH_PRIME * hash + fComments.hashCode(); 
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

    if(fProcess_Property_Name != null) {
      hash = HASH_PRIME * hash + fProcess_Property_Name.hashCode(); 
    }/* if */

    if(fRecipient_Name != null) {
      hash = HASH_PRIME * hash + fRecipient_Name.hashCode(); 
    }/* if */

    if(fRecipient_Type_Code != null) {
      hash = HASH_PRIME * hash + fRecipient_Type_Code.hashCode(); 
    }/* if */

    if(fValue_Type_Code != null) {
      hash = HASH_PRIME * hash + fValue_Type_Code.hashCode(); 
    }/* if */

    return hash;
  }/* public int hashCode(...) */


  public boolean equals(Object object) {
    if(this == object) return true;
    if(object == null) return false;
    if(object.getClass() != getClass()) return false;
    Repository_WF_Step_RecipientIC o = (Repository_WF_Step_RecipientIC)object;

    if(fBusiness_Component_Field == null) { 
       if(o.fBusiness_Component_Field != null) return false; 
    }else if(! fBusiness_Component_Field.equals(o.fBusiness_Component_Field)) return false; 

    if(fBusiness_Component_Name == null) { 
       if(o.fBusiness_Component_Name != null) return false; 
    }else if(! fBusiness_Component_Name.equals(o.fBusiness_Component_Name)) return false; 

    if(fComments == null) { 
       if(o.fComments != null) return false; 
    }else if(! fComments.equals(o.fComments)) return false; 

    if(fExpression == null) { 
       if(o.fExpression != null) return false; 
    }else if(! fExpression.equals(o.fExpression)) return false; 

    if(fInactive == null) { 
       if(o.fInactive != null) return false; 
    }else if(! fInactive.equals(o.fInactive)) return false; 

    if(fName == null) { 
       if(o.fName != null) return false; 
    }else if(! fName.equals(o.fName)) return false; 

    if(fProcess_Property_Name == null) { 
       if(o.fProcess_Property_Name != null) return false; 
    }else if(! fProcess_Property_Name.equals(o.fProcess_Property_Name)) return false; 

    if(fRecipient_Name == null) { 
       if(o.fRecipient_Name != null) return false; 
    }else if(! fRecipient_Name.equals(o.fRecipient_Name)) return false; 

    if(fRecipient_Type_Code == null) { 
       if(o.fRecipient_Type_Code != null) return false; 
    }else if(! fRecipient_Type_Code.equals(o.fRecipient_Type_Code)) return false; 

    if(fValue_Type_Code == null) { 
       if(o.fValue_Type_Code != null) return false; 
    }else if(! fValue_Type_Code.equals(o.fValue_Type_Code)) return false; 

    return true;
  }/* public int equals(...) */


  public Object clone() {
    try {    
      Repository_WF_Step_RecipientIC result = (Repository_WF_Step_RecipientIC) super.clone();

      return result;
    }catch(CloneNotSupportedException cnse) {
       return null;
    }/* try - catch */
  }/* public Object clone(...) */


  public SiebelPropertySet toPropertySet() {
    SiebelPropertySet ps = new SiebelPropertySet();

    ps.setType(CLASS_PROPERTY);

    if(fBusiness_Component_Field != null)   
      ps.setProperty("Business Component Field", fBusiness_Component_Field); 

    if(fBusiness_Component_Name != null)   
      ps.setProperty("Business Component Name", fBusiness_Component_Name); 

    if(fComments != null)   
      ps.setProperty("Comments", fComments); 

    if(fExpression != null)   
      ps.setProperty("Expression", fExpression); 

    if(fInactive != null)   
      ps.setProperty("Inactive", fInactive); 

    if(fName != null)   
      ps.setProperty("Name", fName); 

    if(fProcess_Property_Name != null)   
      ps.setProperty("Process Property Name", fProcess_Property_Name); 

    if(fRecipient_Name != null)   
      ps.setProperty("Recipient Name", fRecipient_Name); 

    if(fRecipient_Type_Code != null)   
      ps.setProperty("Recipient Type Code", fRecipient_Type_Code); 

    if(fValue_Type_Code != null)   
      ps.setProperty("Value Type Code", fValue_Type_Code); 

    return ps;
  }/* public SiebelPropertySet toPropertySet(...) */


  public void fromPropertySet(SiebelPropertySet ps) throws SiebelException {
    if((! PS_TYPE_REQUIRED) || (ps.getType().equals(CLASS_PROPERTY))) {
      fBusiness_Component_Field = ps.getProperty("Business Component Field");
      fBusiness_Component_Name = ps.getProperty("Business Component Name");
      fComments = ps.getProperty("Comments");
      fExpression = ps.getProperty("Expression");
      fInactive = ps.getProperty("Inactive");
      fName = ps.getProperty("Name");
      fProcess_Property_Name = ps.getProperty("Process Property Name");
      fRecipient_Name = ps.getProperty("Recipient Name");
      fRecipient_Type_Code = ps.getProperty("Recipient Type Code");
      fValue_Type_Code = ps.getProperty("Value Type Code");

    }else{
     SiebelException se = new SiebelException(1000, 100);  
        se.setDetailMessage("Input PropertySet is not of type [" + 
                            CLASS_PROPERTY + "]");   
        throw se; 
    }/* if */
  }/* public void fromPropertySet(...) */


  /* access methods for fBusiness_Component_Field */
  public     String getfBusiness_Component_Field() { 
    return fBusiness_Component_Field; 
  }/* public     String getfBusiness_Component_Field(...) */ 

  public     void setfBusiness_Component_Field(String val) { 
    fBusiness_Component_Field = val; 
  }/* public     void setfBusiness_Component_Field(...) */  


  /* access methods for fBusiness_Component_Name */
  public     String getfBusiness_Component_Name() { 
    return fBusiness_Component_Name; 
  }/* public     String getfBusiness_Component_Name(...) */ 

  public     void setfBusiness_Component_Name(String val) { 
    fBusiness_Component_Name = val; 
  }/* public     void setfBusiness_Component_Name(...) */  


  /* access methods for fComments */
  public     String getfComments() { 
    return fComments; 
  }/* public     String getfComments(...) */ 

  public     void setfComments(String val) { 
    fComments = val; 
  }/* public     void setfComments(...) */  


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


  /* access methods for fProcess_Property_Name */
  public     String getfProcess_Property_Name() { 
    return fProcess_Property_Name; 
  }/* public     String getfProcess_Property_Name(...) */ 

  public     void setfProcess_Property_Name(String val) { 
    fProcess_Property_Name = val; 
  }/* public     void setfProcess_Property_Name(...) */  


  /* access methods for fRecipient_Name */
  public     String getfRecipient_Name() { 
    return fRecipient_Name; 
  }/* public     String getfRecipient_Name(...) */ 

  public     void setfRecipient_Name(String val) { 
    fRecipient_Name = val; 
  }/* public     void setfRecipient_Name(...) */  


  /* access methods for fRecipient_Type_Code */
  public     String getfRecipient_Type_Code() { 
    return fRecipient_Type_Code; 
  }/* public     String getfRecipient_Type_Code(...) */ 

  public     void setfRecipient_Type_Code(String val) { 
    fRecipient_Type_Code = val; 
  }/* public     void setfRecipient_Type_Code(...) */  


  /* access methods for fValue_Type_Code */
  public     String getfValue_Type_Code() { 
    return fValue_Type_Code; 
  }/* public     String getfValue_Type_Code(...) */ 

  public     void setfValue_Type_Code(String val) { 
    fValue_Type_Code = val; 
  }/* public     void setfValue_Type_Code(...) */  




  /* member variables */
  protected String  fBusiness_Component_Field = null;
  protected String  fBusiness_Component_Name = null;
  protected String  fComments = null;
  protected String  fExpression = null;
  protected String  fInactive = null;
  protected String  fName = null;
  protected String  fProcess_Property_Name = null;
  protected String  fRecipient_Name = null;
  protected String  fRecipient_Type_Code = null;
  protected String  fValue_Type_Code = null;
}/* Repository_WF_Step_RecipientIC */






