package JavaProjects.P04_okulYönetimi.notHesap;

public class Teacher {
    private String name;
    private String branch;
    int mpno;

    // Teacher constructor, ogretmen objesi olusturmak icin
    public Teacher(String name, String branch, int mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getMpno() {
        return mpno;
    }

    public void setMpno(int mpno) {
        this.mpno = mpno;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", mpno=" + mpno +
                '}';
    }
}
