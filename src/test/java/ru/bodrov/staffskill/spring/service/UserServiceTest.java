package ru.bodrov.staffskill.spring.service;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = ApplicationConfiguration.class)
public class UserServiceTest {

   /* @Autowired
    private DepartmentService departmentService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private DictTestService dictTestService;

    @Autowired
    private TestStaffService testStaffService;

    @Autowired
    private ResultService resultService;

    private static final String depart = "HR - отдел";
    private static final String lastName = "Иванов";
    private static final String firstName = "Иван";
    private static final Date dateAdd = new Date(Calendar.getInstance().getTime().getTime());
    private static final int MIN_BALL = 80;
    private static final int MIN_TIME = 30;
    private static final int STAFF_BALL_1 = 85;
    private static final int STAFF_BALL_2 = 83;
    private static final int STAFF_TIME_1 = 21;
    private static final int STAFF_TIME_2 = 24;

    @Test
    public void test(){

        staffService.deleteAll();
        testStaffService.deleteAll();
        resultService.deleteAll();
        dictTestService.deleteAll();
        departmentService.deleteAll();

        final DepartmentEnt department = new DepartmentEnt();
        department.setDepartmentName(depart);
        departmentService.save(department);
        Assert.assertEquals(1L, departmentService.count());
        Assert.assertNotNull(departmentService.findByDepartmentName(depart));

        final DepartmentEnt department1 = departmentService.findByDepartmentName(depart);
        final StaffEnt staff = new StaffEnt();
        staff.setLastName(lastName);
        staff.setFirstName(firstName);
        staff.setDepartment(department1);
        staff.setDateAddStaff(dateAdd);
        staffService.save(staff);

        Assert.assertEquals(1L, staffService.count());
        Assert.assertNotNull(staffService.findByLastName(lastName));

        final DictTestEnt type = new DictTestEnt();
        type.setNameType("Общий тест");
        dictTestService.save(type);

        final TestStaffEnt newTest = new TestStaffEnt();
        newTest.setTestName("Тест для сотрудников");
        newTest.setDateCreateTest(new Date(Calendar.getInstance().getTime().getTime()));
        newTest.setMinValueBall(MIN_BALL);
        newTest.setTimeTest(MIN_TIME);
        newTest.setType(type);
        testStaffService.save(newTest);

        Assert.assertEquals(1L, testStaffService.count());
        Assert.assertEquals(MIN_BALL, testStaffService.minValueBall());
        Assert.assertEquals(MIN_BALL, testStaffService.maxValueBall());

        final ResultEnt result = new ResultEnt();
        result.setStaff(staff);
        result.setTest(newTest);
        result.setBallResult(STAFF_BALL_1);
        result.setTimeResult(STAFF_TIME_1);
        result.setDateTest(new Date(Calendar.getInstance().getTime().getTime()));
        result.setResult("Зачет");
        resultService.save(result);

        final ResultEnt result1 = new ResultEnt();
        result1.setStaff(staff);
        result1.setTest(newTest);
        result1.setBallResult(STAFF_BALL_2);
        result1.setTimeResult(STAFF_TIME_2);
        result1.setDateTest(new Date(Calendar.getInstance().getTime().getTime()));
        result1.setResult("Зачет");
        resultService.save(result1);

        Assert.assertEquals(2L, resultService.count());
        Assert.assertEquals(STAFF_BALL_2, resultService.minByBallResult());
        Assert.assertEquals(STAFF_BALL_1, resultService.maxByBallResult());
        Assert.assertEquals(STAFF_BALL_1+STAFF_BALL_2, resultService.sumByBallResult());
    }*/


}
