package bai_13.service;

import bai_13.model.WorkflowManagement;

import java.util.Comparator;

public class SortByAmount implements Comparator<WorkflowManagement> {
    @Override
    public int compare(WorkflowManagement o1, WorkflowManagement o2) {
        return o2.getSpendingAmount()-o1.getSpendingAmount();
    }
}
