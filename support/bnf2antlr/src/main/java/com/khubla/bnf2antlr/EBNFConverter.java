package com.khubla.bnf2antlr;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author tom
 */
public class EBNFConverter {
   /**
    * perform conversion
    */
   public void convert(InputStream bnfInput, OutputStream antlrOutput) throws Exception {
      try {
         final EBNFListener ebnfListener = new EBNFListener(antlrOutput);
         EBNFDocumentParser.parse(bnfInput, ebnfListener);
      } catch (final Exception e) {
         throw new Exception("Exception in convert", e);
      }
   }
}
