package com.github.easyzhang;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class TestAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
/*        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);

        String title = "标题";
        String msg = "2018,起航";

        Messages.showMessageDialog(project, msg, title, Messages.getInformationIcon());*/
        Messages.showMessageDialog("这个是我的测试弹窗！", "TestTile", Messages.getWarningIcon());
    }
}
