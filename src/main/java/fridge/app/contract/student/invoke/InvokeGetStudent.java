package fridge.app.contract.student.invoke;

import fridge.app.contract.student.logic.IStudent;
import fridge.app.contract.student.logic.entity.Student;
import cn.hyperchain.contract.BaseInvoke;

public class InvokeGetStudent implements BaseInvoke<Student, IStudent> {

    private String id;

    public InvokeGetStudent() {}

    public InvokeGetStudent(String id) {
        this.id = id;
    }

    @Override public Student invoke(IStudent iStudent) {
        return iStudent.getStudent(id);
    }
}
