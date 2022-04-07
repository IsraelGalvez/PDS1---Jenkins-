job('ejemplo2-job-DSL') 
	description('Job DSL de ejemplo para el curso de Jenkins')
  	steps {
    		shell("bash jobscript.sh")
    	}
  	publishers {
      mailer('macloujulian@gmail.com', true, true)
      slackNotifier {
		  notifyAborted(true)
		  notifyEveryFailure(true)
		  notifyNotBuilt(false)
		  notifyUnstable(false)
		  notifyBackToNormal(true)
		  notifySuccess(false)
		  notifyRepeatedFailure(false)
		  startNotification(false)
		  includeTestSummary(false)
		  includeCustomMessage(false)
		  customMessage(null)
		  sendAs(null)
		  commitInfoChoice('NONE')
		  teamDomain(null)
		  authToken(null)
        	}
    	}
}
