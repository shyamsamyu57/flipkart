package fridge.app.contract.student.invoke;

import fridge.app.contract.student.logic.IStudent;
import fridge.app.contract.student.logic.entity.Student;
import cn.hyperchain.contract.BaseInvoke;

import java.util.List;

public class InvokeGetStudents implements BaseInvoke<List<Student>, IStudent> {

    private List<String> ids;

    public InvokeGetStudents() {}

    public InvokeGetStudents(List<String> ids) {
        this.ids = ids;
    }

    @Override public List<Student> invoke(IStudent iStudent) {
        return iStudent.getStudents(ids);
    }
}
