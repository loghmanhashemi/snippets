import logging

logging.getLogger().setLevel(logging.DEBUG) # all will be printed
print("log level: debug ---- ")
logging.debug("Debug message")
logging.info("Info message")
logging.warning("Warning message")
logging.error("Error message")
logging.critical("Critical message")

logging.getLogger().setLevel(logging.INFO) # debug hides
print("log level: info ---- ")
logging.debug("Debug message")
logging.info("Info message")
logging.warning("Warning message")
logging.error("Error message")
logging.critical("Critical message")

logging.getLogger().setLevel(logging.ERROR) # debug hides
print("log level: error ---- ")
logging.debug("Debug message")
logging.info("Info message")
logging.warning("Warning message")
logging.error("Error message")
logging.critical("Critical message")