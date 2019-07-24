package qatch.java;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;

/**
 * Unit test for simple App.
 */
public class Scratch
{
    @Test
    public void testRoot() throws IOException {
        File root = new File(FileSystems.getDefault().getPath(".").toAbsolutePath().toString()).getCanonicalFile();
        System.out.println(root.toString());

        Assert.assertTrue(true);
    }
}
