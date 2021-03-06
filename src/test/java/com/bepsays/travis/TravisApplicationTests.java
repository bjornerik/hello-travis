package com.bepsays.travis;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class TravisApplicationTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void startApplication() {
        TravisApplication.main(new String[] {});
        assertThat(output(), containsString("Started TravisApplication"));
    }

    private String output() {
        return this.outputCapture.toString();
    }

}
