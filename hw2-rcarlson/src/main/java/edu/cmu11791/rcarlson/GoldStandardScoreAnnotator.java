package edu.cmu11791.rcarlson;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.util.Level;

import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.AnswerScore;

public class GoldStandardScoreAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException {
    Iterator<Annotation> answerIter = jcas.getAnnotationIndex(Answer.type).iterator();
    while (answerIter.hasNext()) {
      Answer answer = (Answer) answerIter.next();
      AnswerScore answerScore = new AnswerScore(jcas);
      answerScore.setAnswer(answer);
      answerScore.setScore(answer.getIsCorrect() ? 1 : 0);
      answerScore.setConfidence(1);
      answerScore.setBegin(answer.getBegin());
      answerScore.setEnd(answer.getEnd());
      answerScore.addToIndexes();
    }
  }
}
