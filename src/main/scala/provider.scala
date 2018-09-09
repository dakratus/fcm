import javax.inject.Inject

import com.typesafe.config.Config
import pureconfig.loadConfig


class DefaultFcmConfigProvider @Inject()(configuration: Config) extends FcmConfigProvider {
  
  }
}