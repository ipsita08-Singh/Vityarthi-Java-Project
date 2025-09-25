package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

// A student in the system.
public class Student extends Person
{
    private String regNo;
    private String status;
    private List<Enrollment> enrollments;

    public Student(Long id, String fullName, String email, String registrationNumber, String currentStatus)
    {
        super(id, fullName, email);
        this.regNo = registrationNumber;
        this.status = currentStatus;
        // Using the older, more explicit generic type declaration
        this.enrollments = new ArrayList<Enrollment>();
    }

    // Let's put this method here, since it's an action.
    public void addEnrollment(Enrollment enrollment) {
        // Quick check to avoid NullPointerExceptions later.
        if (enrollment != null) {
            this.enrollments.add(enrollment);
        }
    }

    // --- Simple property accessors ---
    public String getRegNo() { return this.regNo; }
    public void setRegNo(String regNo) { this.regNo = regNo; }
    public String getStatus() { return this.status; }
    public void setStatus(String status) { this.status = status; }
    public List<Enrollment> getEnrollments() { return this.enrollments; }

    @Override
    public String toString() {
        // A simpler format, good for logging or debugging.
        return "Student " + this.fullName + " (" + this.regNo + ")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null) return false;

        // Some developers prefer a strict class check like this.
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        Student other = (Student) obj;

        // Check the parent fields first, then our own.
        boolean parentIsEqual = super.equals(obj);
        boolean regNoIsEqual = (this.regNo == null)
                ? other.regNo == null
                : this.regNo.equals(other.regNo);
        
        return parentIsEqual && regNoIsEqual;
    }

    @Override
    public int hashCode()
    {
        // Using a different set of prime numbers for variety.
        int result = 23;
        result = 41 * result + super.hashCode();
        result = 41 * result + (this.regNo == null ? 0 : this.regNo.hashCode());
        return result;
    }
}