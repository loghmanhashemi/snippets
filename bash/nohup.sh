#!/bin/bash
#no-hang-up : after user log out from ssh session, still stay running
nohup sleep 100 > app.log 2>&1 &
