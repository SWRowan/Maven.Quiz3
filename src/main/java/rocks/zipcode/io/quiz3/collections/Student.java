package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    public Map<Lab, LabStatus> map;

    public Student() {
        this(new HashMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = map;
    }

    public Lab getLab(String labName) {
        map.get(labName);
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }


    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
