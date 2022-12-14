package com.techelevator.tenmo.services;

public enum TransferStatus {
    //ENUM to be used to keep variables for Pending, Approved, and Rejected separate and easy to call.
    PENDING  ((long)1),
    APPROVED ((long)2),
    REJECTED ((long)3);

    private final Long statusId;

    TransferStatus(Long statusId) {
        this.statusId = statusId;
    }

    public Long getStatusId() {
        return statusId;
    }

    @Override
    public String toString() {
        switch (this) {
            case APPROVED:
                return "Approved";
            case PENDING:
                return "Pending";
            case REJECTED:
                return "Rejected";
        }
        return "";
    }
}
