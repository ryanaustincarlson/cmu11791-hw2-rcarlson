package edu.cmu11791.rcarlson;

import org.apache.uima.UimaContext;
import org.apache.uima.util.Level;

public class Logger {
  public static void log(UimaContext context, String message) {
    context.getLogger().log(Level.INFO, message);
  }
}
