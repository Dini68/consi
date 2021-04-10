package tmp;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Window {

    private String name;

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(name, window.name);
    }

    public boolean contentEquals(StringBuffer sb) {
        return name.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return name.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return name.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return name.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return name.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return name.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return name.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return name.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return name.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return name.endsWith(suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int indexOf(int ch) {
        return name.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return name.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return name.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return name.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return name.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return name.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return name.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return name.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return name.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return name.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return name.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return name.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return name.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return name.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return name.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return name.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return name.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return name.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return name.split(regex, limit);
    }

    public String[] split(String regex) {
        return name.split(regex);
    }

    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    public String toLowerCase(Locale locale) {
        return name.toLowerCase(locale);
    }

    public String toLowerCase() {
        return name.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return name.toUpperCase(locale);
    }

    public String toUpperCase() {
        return name.toUpperCase();
    }

    public String trim() {
        return name.trim();
    }

    public String strip() {
        return name.strip();
    }

    public String stripLeading() {
        return name.stripLeading();
    }

    public String stripTrailing() {
        return name.stripTrailing();
    }

    public boolean isBlank() {
        return name.isBlank();
    }

    public Stream<String> lines() {
        return name.lines();
    }

    public String indent(int n) {
        return name.indent(n);
    }

    public String stripIndent() {
        return name.stripIndent();
    }

    public String translateEscapes() {
        return name.translateEscapes();
    }

    public <R> R transform(Function<? super String, ? extends R> f) {
        return name.transform(f);
    }

    @Override
    public String toString() {
        return "window{" +
                "name='" + name + '\'' +
                '}';
    }

    public IntStream chars() {
        return name.chars();
    }

    public IntStream codePoints() {
        return name.codePoints();
    }

    public char[] toCharArray() {
        return name.toCharArray();
    }

    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    public static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    public String formatted(Object... args) {
        return name.formatted(args);
    }

    public static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    public static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    public static String valueOf(char c) {
        return String.valueOf(c);
    }

    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    public static String valueOf(long l) {
        return String.valueOf(l);
    }

    public static String valueOf(float f) {
        return String.valueOf(f);
    }

    public static String valueOf(double d) {
        return String.valueOf(d);
    }

    public String intern() {
        return name.intern();
    }

    public String repeat(int count) {
        return name.repeat(count);
    }

    public Optional<String> describeConstable() {
        return name.describeConstable();
    }

    public String resolveConstantDesc(MethodHandles.Lookup lookup) {
        return name.resolveConstantDesc(lookup);
    }

    public static int compare(CharSequence cs1, CharSequence cs2) {
        return CharSequence.compare(cs1, cs2);
    }

    public Window() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int length() {
        return name.length();
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }

    public char charAt(int index) {
        return name.charAt(index);
    }

    public int codePointAt(int index) {
        return name.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return name.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return name.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return name.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        name.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        name.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return name.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return name.getBytes(charset);
    }

    public byte[] getBytes() {
        return name.getBytes();
    }

    public static void main(String[] args) {
        Window window = new Window("Kovács");
        System.out.println(window.charAt(4));
        System.out.println(window.hashCode());
        System.out.println(window.startsWith("l"));
        System.out.println(window.concat("Dénes"));
        System.out.println(window.compareTo("Lajos"));
        System.out.println(window.compareTo("Bajos"));
        System.out.println(window.compareTo("Kovács"));
        System.out.println(window.indent(5));
        System.out.println(Arrays.toString(window.toCharArray()));
        System.out.println(Arrays.toString(window.getBytes()));
        System.out.println(window.repeat(3));

    }

}

