

/* First created by JCasGen Mon Sep 23 17:46:06 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 23 17:46:06 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw2-rcarlson/hw2-rcarlson/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Evaluation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precisionAtN

  /** getter for precisionAtN - gets 
   * @generated */
  public double getPrecisionAtN() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.deiis.types.Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionAtN);}
    
  /** setter for precisionAtN - sets  
   * @generated */
  public void setPrecisionAtN(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.deiis.types.Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionAtN, v);}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets 
   * @generated */
  public FSArray getAnswers() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.types.Evaluation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets  
   * @generated */
  public void setAnswers(FSArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.types.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - 
   * @generated */
  public AnswerScore getAnswers(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.types.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - 
   * @generated */
  public void setAnswers(int i, AnswerScore v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.types.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    