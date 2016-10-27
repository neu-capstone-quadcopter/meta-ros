SRC_URI = "https://github.com/OctoMap/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ddd7c041dc2ddb1a04b0a1859d1cb8d7"
SRC_URI[sha256sum] = "f5663b7893abd06fca062dcea59a3534b91e278b4f59d54ba377e5d3ef8bb1fe"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "octomap_mapping"
