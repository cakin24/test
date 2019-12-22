package NetworkCourse;

public class BigDataCourse extends NetworkCourse{

    @Override
    void checkHomework() {
        System.out.println("检查大数据课后作业");
    }

    private boolean needHomeworkFlag = false;

    public BigDataCourse( boolean needHomeworkFlag ) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    protected boolean needHomework(){
        return this.needHomeworkFlag;

    }
}
