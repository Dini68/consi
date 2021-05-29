package stringbuilder;

public class NameBuilder {
    public String concatNameWesternStyle(String familyName, String middleName,
                                         String givenName, Title title) {
        if (familyName == null || familyName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if (givenName == null || givenName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null) {
            sb.append(title.getTitle()).append(" ");
        }
        sb.append(givenName).append(" ");
        if (middleName != null && !middleName.isBlank()) {
            sb.append(middleName).append(" ");
        }
        sb.append(familyName);
        return sb.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName,
                                           String givenName, Title title) {
        if (familyName == null || familyName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if (givenName == null || givenName.isBlank()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder sb = new StringBuilder();
        if (title != null) {
            sb.append(title.getTitle()).append(" ");
        }
        sb.append(familyName).append(" ");
        if (middleName != null && !middleName.isBlank()) {
            sb.append(middleName).append(" ");
        }
        sb.append(givenName);
        return sb.toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        sb.insert(name.indexOf(where) + 1, title.getTitle() + " ");
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {
        return name.replace(delete, "");
    }
}
