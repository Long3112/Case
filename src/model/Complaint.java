package model;

public class Complaint {
    private String complaintName;
    private String complaintContent;

    public Complaint(String complaintName, String complaintContent) {
        this.complaintName = complaintName;
        this.complaintContent = complaintContent;
    }

    public Complaint() {
    }

    public String getComplaintName() {
        return complaintName;
    }

    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }
}
