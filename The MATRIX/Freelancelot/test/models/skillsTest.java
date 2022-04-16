package models;

import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertSame;

/**
 * Skills Test Class
 * @author Raahul John
 */
public class skillsTest {
    @Test
    public void getskillsdatatest() throws MalformedURLException {
        skills sl = new skills();
        assertSame(sl.skills_active,sl.getDataSkills("php"));
    }
}