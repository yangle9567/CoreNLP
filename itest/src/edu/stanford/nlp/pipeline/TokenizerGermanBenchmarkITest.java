package edu.stanford.nlp.pipeline;

import java.util.Properties;

public class TokenizerGermanBenchmarkITest extends TokenizerBenchmarkTestCase {

    @Override
    public void setUp() {
        // set up the pipeline
        Properties props = new Properties();
        props.put("annotators", "tokenize");
        props.put("tokenize.language", "de");
        props.put("tokenize.mwt.mappingFile",
                "/u/nlp/data/stanford-corenlp-testing/resources/de_mwt.tsv");
        pipeline = new StanfordCoreNLP(props);
    }

    public void testOnDev() {
        goldFilePath = "/u/nlp/data/stanford-corenlp-testing/data/tokenize/de_gsd-ud-dev.conllu";
        runTest("dev", "de", 0.95);
    }

}
