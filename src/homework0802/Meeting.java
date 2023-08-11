package homework0802;

public class Meeting {
    private String meetingRoomId;
    private String meetingRoomName;
    private String useState;

    public Meeting(String meetingRoomId, String meetingRoomName, String useState) {
        this.meetingRoomId = meetingRoomId;
        this.meetingRoomName = meetingRoomName;
        this.useState = useState;
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState;
    }

    public void book(String applicantName) {

        if (useState.equals("空闲")) {
            System.out.println(applicantName+"成功申请"+getMeetingRoomId()+getMeetingRoomName());

        } else {
            useState = "预定";
            System.out.println(getMeetingRoomId()+getMeetingRoomName()+"已经被预订！");
        }
    }
}

