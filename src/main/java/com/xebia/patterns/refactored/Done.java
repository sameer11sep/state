package com.xebia.patterns.refactored;

/**
 * Created by sameerarora on 6/5/15.
 * Adding Code to create a PR
 */
public class Done extends TaskState {
    public Done(String done) {
        super(done);
    }

    @Override
    public void reOpen(AgileTask task) {
        task.setState(TaskState.TO_DO);
    }

}
