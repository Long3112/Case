package manager;

import model.Complaint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComplaintManager {

    Scanner scanner = new Scanner(System.in);
    List<Complaint> complaints = new ArrayList<>();

    public void submitComplaint() {
        System.out.println("Nhập tên người khiếu nại:");
        String complaintName = scanner.nextLine();
        System.out.println("Nhập nội dung khiếu nại:");
        String complaintContent = scanner.nextLine();

        Complaint newComplaint = new Complaint();
        newComplaint.setComplaintName(complaintName);
        newComplaint.setComplaintContent(complaintContent);
        complaints.add(newComplaint);

        System.out.println("Khiếu nại đã được gửi.");
    }

    public void viewComplaints() {
        for (Complaint c : complaints) {
            if (c.getComplaintName() != null && c.getComplaintContent() != null) {
                System.out.println("Tên người khiếu nại: " + c.getComplaintName());
                System.out.println("Nội dung khiếu nại: " + c.getComplaintContent());
                System.out.println("---------------------------");
            }
        }
    }
}
