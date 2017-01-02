#!/bin/bash 
######################################################################## NXSH
													   export boxREVISION=114
													  	         SCNAME=NXSH
 SCROOT=$ISLE/PORT/$SCNAME
													  	  
													 SCLANG=$SCROOT/lang.def
 
 shopt -s autocd
 shopt -s direxpand

 	source $SCLANG

 if [ "${ANDROID_ROOT}" ]; then def _SYS 'ANDROID'; fix
######################################################################## NXSH
													  SECT_NAME '  #IMPORTS'
 _FILE_CABINET=( "$SCROOT/globals"
													   
		 	"$SCROOT/systems/desktop/_desk.source"
		 	"$SCROOT/systems/android/_andr.source"

		 	"$SCROOT/includes/nataFTP.sc"
		 	"$SCROOT/includes/Tarot_ARRAYS" );
             
											 	for i in ${_FILE_CABINET[@]}
											 	do	 	 		source $i
     
												 _iterate
  
 _FILE_CABINET+=(  "$HOME/.init_na"
                   "$SCROOT/shell.sc"
                   "$SCROOT/lang")

######################################################################## NXSH
	  def SCBACK_UP           $TUNDRA/ARCHIVE

      Conscript backmeup()
      {
      	  local OF;
      	    def OF	"/var/my-backup-$(date +%Y%m%d).tgz"
           
      	   tar -cZf $OF $SCROOT
      }

      function rev_me()
      {
      	  local next_revn;
      	    def next_revn		$(( $boxREVISION+1));

      	  if [ $(wget "natanel.com/_rvn${next_revn}.tar.gz") ]; then
      	  	  inst_ "${next_revn}.tar.gz"; fix
  	  }
######################################################################## NXSH
    
#         _NATE_GLOSC=~/nate.globalsource   should define themselves in incs
#    _MACHINE_GLOBALS=~/.machine.globals
#        _MACHINEVARS=~/.machine.vars
#         _MACHINE_CO=~/.machinerc
#            _GLOBALS=~/nateRC.globals
#             NATE_RC=~/nateRC.box
#
									alias NXSH="_edit $SCROOT/shell.sc"
######################################################################## NXSH
#############################################################################
 POST_PARTUM