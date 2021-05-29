package stringmethods.filename;

public class FileNameManipulator {

    public void checkFileName(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
    }

    public void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
    }

    public void checkArgument(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
    }

    public char findLastCharacter(String str) {
        checkString(str);
        return str.trim().charAt(str.trim().length()-1);
    }

    public String findFileExtension(String fileName) {
        if (fileName == null || fileName.trim().length() < 3 || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        String name = fileName.substring(0, fileName.indexOf('.'));
        String ext = fileName.substring(fileName.indexOf('.'));
        checkString(name);
        checkString(ext);
        return ext;
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (fileName.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (ext == null || ext.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return findFileExtension(fileName).equals("." + ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        checkArgument(searchedFileName);
        checkArgument(actualFileName);
        return searchedFileName.substring(0, searchedFileName.indexOf('.')).equals(
                actualFileName.substring(0, actualFileName.indexOf('.')));
    }

    public String changeExtensionToLowerCase(String fileName) {
        checkFileName(fileName);
        if (fileName.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        String name = fileName.substring(0, fileName.indexOf('.'));
        String ext = fileName.substring(fileName.indexOf('.') + 1);
        checkArgument(name);
        checkArgument(ext);
        return name + findFileExtension(fileName).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        checkFileName(fileName);
        return fileName.replace(present, target);
    }
}
