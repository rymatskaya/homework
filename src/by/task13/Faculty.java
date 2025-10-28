package by.task13;

import java.util.List;

/**У факультета:  наименование факультета, список групп (List<Group> groups. )*/
public class Faculty {
    private String faculty;
    private List<Group> groups;

    public Faculty(String faculty, List<Group> groups) {
        this.faculty = faculty;
        this.groups = groups;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
