import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
/*
    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com","some-page.html"),MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testSpaceAfterParen() {
        String contents = "[title]( space-in-url.com)";
        List<String> expect = List.of("space-in-url.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    */

    @Test
    public void Snippet1() throws IOException{
        Path fileName = Path.of("snippet1.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("`google.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void Snippet2() throws IOException{
        Path fileName = Path.of("snippet2.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("a.com","a.com(())","example.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void Snippet3() throws IOException{
        Path fileName = Path.of("snippet3.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(contents));
    }
}