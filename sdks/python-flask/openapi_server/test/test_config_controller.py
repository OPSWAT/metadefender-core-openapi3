# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.admin_config_session import AdminConfigSession  # noqa: E501
from openapi_server.models.admin_config_update import AdminConfigUpdate  # noqa: E501
from openapi_server.models.admin_config_webhook import AdminConfigWebhook  # noqa: E501
from openapi_server.models.inline_object1 import InlineObject1  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.skip_list import SkipList  # noqa: E501
from openapi_server.models.unknownbasetype import UNKNOWN_BASE_TYPE  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConfigController(BaseTestCase):
    """ConfigController integration test stubs"""

    def test_config_audit_log(self):
        """Test case for config_audit_log

        Audit clean up
        """
        unknown_base_type = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/auditlog',
            method='PUT',
            headers=headers,
            data=json.dumps(unknown_base_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_get_skip_hash(self):
        """Test case for config_get_skip_hash

        Get 'skip by hash' list
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/skip',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_quarantine(self):
        """Test case for config_quarantine

        Quarantine clean up
        """
        unknown_base_type = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/quarantine',
            method='PUT',
            headers=headers,
            data=json.dumps(unknown_base_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_sanitized_repo(self):
        """Test case for config_sanitized_repo

        Sanitized files clean up
        """
        inline_object1 = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/sanitize',
            method='PUT',
            headers=headers,
            data=json.dumps(inline_object1),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_scan_history(self):
        """Test case for config_scan_history

        Processing history clean up
        """
        unknown_base_type = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/scanhistory',
            method='PUT',
            headers=headers,
            data=json.dumps(unknown_base_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_session(self):
        """Test case for config_session

        Session settings
        """
        admin_config_session = {
  "allowCrossIpSessions" : true,
  "allowDuplicateSession" : true,
  "sessionTimeout" : 300000,
  "absoluteSessionTimeout" : 0
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/session',
            method='PUT',
            headers=headers,
            data=json.dumps(admin_config_session),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_update(self):
        """Test case for config_update

        Modules Update Source and Frequency
        """
        admin_config_update = {
  "disabledupdate" : [ {
    "days" : "5-7",
    "from" : 480,
    "to" : 960
  }, {
    "days" : "5-7",
    "from" : 480,
    "to" : 960
  } ],
  "autoupdateperiod" : 240,
  "source" : "internet",
  "pickupfolder" : "/tmp/core-data/update_autoadd",
  "deleteafterimport" : true
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/update',
            method='PUT',
            headers=headers,
            data=json.dumps(admin_config_update),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_update_skip_hash(self):
        """Test case for config_update_skip_hash

        Modify 'skip by hash' list
        """
        skip_list = {
  "blacklist" : {
    "edecbf6bd03ef340e0c6cd438a4069c2" : {
      "comment" : "example3"
    }
  },
  "skip" : {
    "13d8b8329bd2f668e6a889f32feaa48c832dbf0c" : {
      "comment" : "example4",
      "engines" : [ "totaldefense" ]
    }
  },
  "whitelist" : {
    "6e340b9cffb37a989ca544e6bb780a2c78901d3fb33738768511a30617afa01d" : {
      "comment" : "example5"
    },
    "df72d035b31b1ff89f752e83af14b9e9dcf4913d9954f074546860d10b6908fb" : {
      "comment" : "example2"
    }
  }
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/skip',
            method='PUT',
            headers=headers,
            data=json.dumps(skip_list),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_update_webhook(self):
        """Test case for config_update_webhook

        Webhook set configuration
        """
        admin_config_webhook = {
  "maxretrytime" : 3,
  "deplayprogression" : 1000,
  "delayduration" : 1000
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/config/webhook',
            method='PUT',
            headers=headers,
            data=json.dumps(admin_config_webhook),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_config_webhook(self):
        """Test case for config_webhook

        Webhook get configuration
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/admin/config/webhook',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
